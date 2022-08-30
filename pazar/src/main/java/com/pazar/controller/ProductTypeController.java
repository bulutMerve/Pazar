package com.pazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pazar.model.Brand;
import com.pazar.model.ProductType;
import com.pazar.service.ProductTypeService;

@Controller
public class ProductTypeController {
	
	@Autowired
	private ProductTypeService productTypeService;
	
	public ProductTypeController() {
		this.productTypeService = productTypeService;
	}
	
	@GetMapping("/saveproducttype")
	public String createProductType(@ModelAttribute("producttypeVM") ProductType productType) {
		return "producttype/create";
	}

	  @PostMapping("/saveproducttype")
	    public String saveProductType(ProductType productType) {
		  productTypeService.saveProductType(productType);
	        return "redirect:/producttypelist";
	    }
	  
	  @RequestMapping("/producttypelist")
	    public String producttypeList(Model model) {
	        List<ProductType> producttypeList = productTypeService.listProductType();
	        model.addAttribute("producttypeListVM", producttypeList);
	        return "producttype/list";
	    }

}
