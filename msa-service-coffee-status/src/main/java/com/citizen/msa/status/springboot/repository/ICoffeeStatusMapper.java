package com.citizen.msa.status.springboot.repository;

import org.apache.ibatis.annotations.Mapper;
import com.citizen.msa.status.springboot.repository.dvo.OrderStatusDVO;

@Mapper
public interface ICoffeeStatusMapper {
    int insertCoffeeOrderStatus(OrderStatusDVO orderStatusDVO);
    OrderStatusDVO selectCoffeeOrderStatus();
    int createStatusTable();
}
