package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PRICE")
	private Double price;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	@Column(name="CATEGORY")
	private CategoryModel category;
}
