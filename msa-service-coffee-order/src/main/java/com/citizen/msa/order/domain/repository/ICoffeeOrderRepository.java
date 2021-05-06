package com.citizen.msa.order.domain.repository;

import com.citizen.msa.order.domain.model.OrderEntity;

public interface ICoffeeOrderRepository {

    public String coffeeOrderSave(OrderEntity orderEntity);
}
