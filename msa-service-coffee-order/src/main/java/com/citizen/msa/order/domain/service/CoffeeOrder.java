package com.citizen.msa.order.domain.service;

import com.citizen.msa.order.domain.model.OrderEntity;
import com.citizen.msa.order.domain.model.CoffeeOrderCVO;
import com.citizen.msa.order.domain.repository.ICoffeeOrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CoffeeOrder implements ICoffeeOrder {

    private final ICoffeeOrderRepository iCoffeeOrderRepository;

    @Override
    public String coffeeOrder(CoffeeOrderCVO coffeeOrderCVO) {

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber(coffeeOrderCVO.getOrderNumber());
        orderEntity.setCoffeeName(coffeeOrderCVO.getCoffeeName());
        orderEntity.setCoffeeCount(coffeeOrderCVO.getCoffeeCount());
        orderEntity.setCustomerName(coffeeOrderCVO.getCustomerName());

        iCoffeeOrderRepository.coffeeOrderSave(orderEntity);

        return orderEntity.getId();
    }
}
