package com.Marlon.GoDevSeniorM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marlon.GoDevSeniorM.models.OrderItens;

public interface OderItensRepository extends JpaRepository<OrderItens, Long>{

	OrderItens findById(long id);
}
