package com.pazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@PostMapping("/savecompany")
	public String saveCompany(Company company) {
		companyService.saveCompany(company);
		return "redirect:/companylist";
	}
	
	@RequestMapping("/companylist")
	public String companyList(Model model) {
		List <Company> companyList = companyService.listCompany();
		model.addAttribute("companyListVM",companyList);
		return "company/list";
		
		
	}
}
