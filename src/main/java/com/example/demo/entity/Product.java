package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	  public Integer getId() {
	    return id;
	  }

	  public void setId(Integer id) {
	    this.id = id;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  
	  public Integer getQuantity() {
		    return quantity;
		  }

	  public void setQuantity(Integer quan) {
		    this.quantity = quan;
		  }
	  
	  public Double getPrice() {
		    return price;
		  }

	  public void setPrice(Double p) {
		    this.price = p;
		  }
}
