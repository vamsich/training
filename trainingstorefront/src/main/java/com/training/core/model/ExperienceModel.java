package com.training.core.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="EXPERIENCE")
public class ExperienceModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="YEARS")
	private Integer years;
	
	@Column(name="MONTHS")
	private Integer months;

	@OneToMany
	@JoinColumn(name="fields")
	private List<Field> fields;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		this.months = months;
	}
	
}
