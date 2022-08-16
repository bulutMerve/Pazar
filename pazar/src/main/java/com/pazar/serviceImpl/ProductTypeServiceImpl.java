package com.pazar.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pazar.model.ProductType;
import com.pazar.repository.ProductTypeRepository;
import com.pazar.service.ProductTypeService;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	private ProductTypeRepository productTypeRepository;

	@Override
	public ProductType saveProductType(ProductType productType) {
		
		return productTypeRepository.save(productType);
	}

	@Override
	public List<ProductType> listProductType() {
		
		return (List<ProductType>) productTypeRepository.findAll();
	}

	@Override
	public void deleteProductType(int id) {
	
		productTypeRepository.deleteById(id);
	}

	@Override
	public ProductType getProductType(int id) {
		
		return productTypeRepository.findById(id).get();
	}
}
