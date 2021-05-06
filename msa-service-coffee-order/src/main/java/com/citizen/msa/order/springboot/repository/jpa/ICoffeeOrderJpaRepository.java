package com.citizen.msa.order.springboot.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICoffeeOrderJpaRepository  extends CrudRepository<OrderEntityJPO, String> {
}
