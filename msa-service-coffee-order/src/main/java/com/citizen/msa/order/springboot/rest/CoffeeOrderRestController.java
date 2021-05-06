package com.citizen.msa.order.springboot.rest;

import com.citizen.msa.order.domain.model.CoffeeOrderCVO;
import com.citizen.msa.order.springboot.messageq.KafkaProducer;
import com.citizen.msa.order.springboot.service.CoffeeOrderServiceImpl;
import com.citizen.msa.order.springboot.service.IMsaServiceCoffeeMember;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeOrderRestController {

    @Autowired
    private CoffeeOrderServiceImpl coffeeOrderService;

    @Autowired
    private KafkaProducer kafkaProducer;

    private IMsaServiceCoffeeMember iMsaServiceCoffeeMember;

    @HystrixCommand
    @RequestMapping(value = "/coffeeOrder", method = RequestMethod.POST)
    public ResponseEntity<CoffeeOrderCVO> coffeeOrder(@RequestBody CoffeeOrderCVO coffeeOrderCVO) {

//        if (iMsaServiceCoffeeMember.coffeeMember(coffeeOrderCVO.getCustomerName())) {
//            System.out.println(coffeeOrderCVO.getCustomerName() + " is a memebr!");
//        }

        //coffee order
        coffeeOrderService.coffeeOrder(coffeeOrderCVO);

        //kafka
        kafkaProducer.send("citizen-kafka-test", coffeeOrderCVO);

        return new ResponseEntity<>(coffeeOrderCVO, HttpStatus.OK);
    }
}
