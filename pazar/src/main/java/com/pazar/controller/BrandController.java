package com.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pazar.model.Brand;
import com.pazar.service.BrandService;

@Controller
public class BrandController {

	@Autowired
	private BrandService brandService;

	public BrandController(BrandService brandService) {
		this.brandService = brandService;
	}

	@GetMapping("/savebrand")
	public String saveBrand(@ModelAttribute("brandVM") Brand brand) {
		return "brand/create";
	}


}