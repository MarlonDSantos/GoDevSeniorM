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

import com.Marlon.GoDevSeniorM.models.Item;
import com.Marlon.GoDevSeniorM.repository.ItemRepository;


@RestController
@RequestMapping(value="/api")

public class ItemResource {

		@Autowired
		ItemRepository itemRepository;

		
		@GetMapping("/items")
		public List<Item> listaItems(){
			return itemRepository.findAll();
		}
		
		@GetMapping("/item/{id}")
		public Item listaItemUnico(@PathVariable(value="id") long id){
			return itemRepository.findById(id);
		}
		
		@PostMapping("/item")
		public Item salvaItem(@RequestBody Item item) {
			return itemRepository.save(item);
		}
		
		@DeleteMapping("/item")
		public void deletaItem(@RequestBody Item item) {
			itemRepository.delete(item);
		}
		
		@PutMapping("/item")
		public Item atualizaItem(@RequestBody Item item) {
			return itemRepository.save(item);
		}
		
		
}
