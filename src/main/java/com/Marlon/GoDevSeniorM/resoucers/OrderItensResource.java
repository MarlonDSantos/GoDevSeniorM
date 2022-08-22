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

import com.Marlon.GoDevSeniorM.models.OrderItens;
import com.Marlon.GoDevSeniorM.repository.OderItensRepository;



@RestController
@RequestMapping(value="/api")

public class OrderItensResource {

	@Autowired
	OderItensRepository  orderItensRepository;
	
	@GetMapping("/orders/itens")
	public List<OrderItens> listaOdersItens(){
		return orderItensRepository.findAll();
	}
	
	@GetMapping("/order/{id}/item/{idi}")
	public OrderItens listaOrderItemUnico(@PathVariable long id, @PathVariable long idi){
		return orderItensRepository.findById(id);
		
	}
	
	@PostMapping("/order/{id}/item/{idi}")
	public OrderItens salvaOrderItens(@RequestBody OrderItens orderItens) {
		return orderItensRepository.save(orderItens);
	}

	@DeleteMapping("/order/{id}/item/{idi}")
	public void deletaOrderItens(@RequestBody OrderItens orderItens) {
		orderItensRepository.delete(orderItens);
	}

	@PutMapping("/order/{id}/item/{idi}")
	public OrderItens atualizaOrderItens(@RequestBody OrderItens orderItens) {
		return orderItensRepository.save(orderItens);
	}
}
