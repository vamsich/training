package com.training.storefront.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.ProductData;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public void createProduct(ProductData productData)
	{
		
	}
}
