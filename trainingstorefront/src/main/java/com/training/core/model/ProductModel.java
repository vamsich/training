package com.training.core.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class ProductModel 
{
	private Long id;
	private String name;
	private String description;
	private Double price;
	private Date creationTime;
}
