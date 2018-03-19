package com.training.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ORDER")
public class OrderModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	@JoinColumn(name="PRODUCT")
	private ProductModel product;
	
	@OneToOne
	@JoinColumn(name="CUSTOMER")
	private CustomerModel customer;
	
	@OneToOne
	@JoinColumn(name="TRAINER")
	private CustomerModel trainer;
	
	@Column(name="TOTAL_AMOUNT")
	private Double totalAmount;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public ProductModel getProduct() {
		return product;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
