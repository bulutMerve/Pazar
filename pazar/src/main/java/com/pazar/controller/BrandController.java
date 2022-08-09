package com.pazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String createBrand(@ModelAttribute("brandVM") Brand brand) {
		return "brand/create";
	}

	  @PostMapping("/savebrand")
	    public String saveBrand(Brand brand) {
		  brandService.SaveBrand(brand);
	        return "redirect:/brandlist";
	    }
	  
	  @RequestMapping("/brandlist")
	    public String brandList(Model model) {
	        List<Brand> brandList = brandService.listBrand();
	        model.addAttribute("brandListVM", brandList);
	        return "brand/list";
	    }
	  
	  @GetMapping("/updatebrand/{id}")
	    public String updateBrand(@PathVariable("id") int id, Model model) {
		  Brand brand = brandService.getBrand(id);
	        model.addAttribute("brandVM", brand);
	        return "brand/update";
	    }

}
