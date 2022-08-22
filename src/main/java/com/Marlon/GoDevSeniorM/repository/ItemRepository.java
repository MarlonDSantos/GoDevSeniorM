package com.Marlon.GoDevSeniorM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marlon.GoDevSeniorM.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	
	Item findById(long id);
}
