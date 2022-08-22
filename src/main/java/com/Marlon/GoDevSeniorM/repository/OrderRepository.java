package com.Marlon.GoDevSeniorM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marlon.GoDevSeniorM.models.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	Order findById(long id);
	
}
