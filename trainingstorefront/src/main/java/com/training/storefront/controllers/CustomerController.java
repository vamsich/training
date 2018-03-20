package com.training.storefront.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.core.data.CustomerData;
import com.training.core.data.ExperienceData;
import com.training.core.data.FieldsData;
import com.training.core.model.CustomerModel;
import com.training.core.model.ExperienceModel;
import com.training.core.model.Field;
import com.training.core.service.CustomerExperienceService;
import com.training.core.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController 
{
	@Resource(name="customerService")
	private CustomerService customerService;
	
	@Resource(name="customerExperienceService")
	private CustomerExperienceService customerExperienceService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	@ResponseBody
	public void createCustomer(CustomerData customerData)
	{
		CustomerModel customer= new CustomerModel();
		customer.setFirstName(customerData.getFirstName());
		customer.setLastName(customerData.getLastName());
		customer.setEmail(customerData.getEmail());
		customer.setMobile(customerData.getMobile());
		customer.setPassword(customerData.getPassword());
		customerService.saveCustomer(customer);
	}
	
	@RequestMapping(value="/addexperience", method= RequestMethod.POST)
	public void saveExperience(ExperienceData experienceData)
	{
		ExperienceModel experience= new ExperienceModel();
		experience.setMonths(experienceData.getMonths());
		experience.setYears(experienceData.getYears());
		experience.setSummary(experienceData.getSummary());
		
		List<Field> fields= new ArrayList<Field>();
		for(FieldsData fieldData: experienceData.getFields())
		{
			Field field= new Field();
			field.setId(fieldData.getId());
			field.setName(fieldData.getName());
			fields.add(field);
		}
		experience.setFields(fields);
		customerExperienceService.saveExperience(experience);
	}
}
