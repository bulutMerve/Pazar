package com.pazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.pazar.model.Company;
import com.pazar.service.CompanyService;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;

	public CompanyController(CompanyService companyService) {
		this.companyService=companyService;
	}
	
	@GetMapping("/savecompany")
	public String createCompany(@ModelAttribute("companyVM") Company company) {
		return "company/create";
	}
}
