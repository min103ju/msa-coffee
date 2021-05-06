package com.citizen.msa.order.springboot.service;

import com.citizen.msa.order.domain.repository.ICoffeeOrderRepository;
import com.citizen.msa.order.domain.service.CoffeeOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CoffeeOrderServiceImpl extends CoffeeOrder {

    public CoffeeOrderServiceImpl(ICoffeeOrderRepository iCoffeeOrderRepository) {
        super(iCoffeeOrderRepository);
    }
}
