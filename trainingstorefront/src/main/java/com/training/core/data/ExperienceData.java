package com.training.core.data;

import java.util.List;

public class ExperienceData 
{
	private Long id;
	private Integer years;
	private Integer months;
	private String descriptions;
	private String summary;
	private List<FieldsData> fields;
	
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
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public List<FieldsData> getFields() {
		return fields;
	}
	public void setFields(List<FieldsData> fields) {
		this.fields = fields;
	}
	
}
