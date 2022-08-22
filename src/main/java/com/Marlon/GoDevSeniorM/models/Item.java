package com.Marlon.GoDevSeniorM.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_ITEM")
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String description;
	private double value;
	private char produto;
	private char servico;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	public char getProduto() {
		return produto;
	}
	public void setProduto(char produto) {
		this.produto = produto;
	}
	public char getServico() {
		return servico;
	}
	public void setServico(char servico) {
		this.servico = servico;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
