package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="REVIEW")
public class CustomerReviewModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="RATING")
	private Integer rating;
	
	@Column(name="COMMENT")
	private String comment;
	
	@OneToOne
	@JoinColumn(name="CUSTOMER")
	private CustomerModel customer;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	
}
