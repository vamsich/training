package com.training.storefront.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.core.data.ProductData;
import com.training.core.model.ProductModel;
import com.training.core.service.ProductService;

@Controller
@RequestMapping("/p")
public class ProductController 
{
	@Resource(name="productService")
	private ProductService productService;
	
	@RequestMapping(value="/create", method= RequestMethod.POST)
	public void createProduct(ProductData productData)
	{
		ProductModel product= new ProductModel();
		product.setName(productData.getName());
		product.setPrice(productData.getPrice());
		product.setDescription(productData.getDescription());
		product.setPrice(productData.getPrice());
		productService.createProduct(product);
	}
}
