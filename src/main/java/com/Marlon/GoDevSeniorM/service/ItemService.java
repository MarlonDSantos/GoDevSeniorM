package com.Marlon.GoDevSeniorM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Marlon.GoDevSeniorM.models.Item;
import com.Marlon.GoDevSeniorM.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemrepository;
	
	public List<Item> ListaTodos(){
		return (List<Item>)itemrepository.findAll();
	}
}
