package com.devedernatan.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //preparar codigo para uma tabela do banco 
@Table(name = "tb_sales") // tabela do banco 



public class Sale {
	
   @Id 	//colocar parametro para indentificas as linhas da tabela
@GeneratedValue (strategy = GenerationType.IDENTITY) //mapeamento no banco 
   private Long id;
    
	private String sellerName;         //vendedor sale_name
	
	private Integer visited ;   //numero de visitas
	
	private Double deals;          //vendas
	
	private Double amount;           //total quantia vendida
	
	private LocalDate date;
	
	
	
public Sale() {	 
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getSellerName() {
	return sellerName;
}

public void setSellerName(String sellerName) {
	this.sellerName = sellerName;
}

public Integer getVisited() {
	return visited;
}

public void setVisited(Integer visited) {
	this.visited = visited;
}

public Double getDeals() {
	return deals;
}

public void setDeals(Double deals) {
	this.deals = deals;
}

public Double getAmount() {
	return amount;
}

public void setAmount(Double amount) {
	this.amount = amount;
}

public LocalDate getDate() {
	return date;
}

public void setDate(LocalDate date) {
	this.date = date;
}


}
