package com.Marlon.GoDevSeniorM.resoucers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.Marlon.GoDevSeniorM.models.Order;
import com.Marlon.GoDevSeniorM.repository.OrderRepository;



@RestController
@RequestMapping(value="/api")

public class OrderResource {
	
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/orders")
	public List<Order> listaOders(){
		return orderRepository.findAll();
	}
	
	@GetMapping("/order/{id}")
	public Order listaOrderUnico(@PathVariable(value="id") long id){
		return orderRepository.findById(id);
	}
	
	@PostMapping("/order")
	public Order salvaOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	
	@DeleteMapping("/order")
	public void deletaOrder(@RequestBody Order order) {
		orderRepository.delete(order);
	}
	
	@PutMapping("/order")
	public Order atualizaOrder(@RequestBody Order order) {
		return orderRepository.save(order);
	}
	@GetMapping("/order/{id}/close")
	public Order listaOrderDesconto(@PathVariable(value="id") long id){
		
		return orderRepository.findById(id);
	}
}
