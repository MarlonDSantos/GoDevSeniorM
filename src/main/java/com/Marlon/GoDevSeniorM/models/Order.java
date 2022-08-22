package com.Marlon.GoDevSeniorM.models;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_ORDER")
public class Order implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private Integer number;
	private Timestamp date;
	private double percentualDiscont;
	private double totalValue;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public double getPercentualDiscont() {
		return percentualDiscont;
	}
	public void setPercentualDiscont(double percentualDiscont) {
		this.percentualDiscont = percentualDiscont;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	/**
	 * 
	 */
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
