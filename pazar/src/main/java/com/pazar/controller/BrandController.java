package com.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pazar.service.BrandService;

@Controller
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	  public BrandController(BrandService brandService) {
	        this.brandService = brandService;
	    }
	
	
}
