package com.citizen.msa.status.springboot.repository.dvo;

import lombok.Data;

@Data
public class OrderStatusDVO {
    private String id;
    private String orderHistory;

    public void setId(String id) {
        this.id = id;
    }

}
