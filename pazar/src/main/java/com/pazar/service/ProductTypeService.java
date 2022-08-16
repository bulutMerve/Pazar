package com.pazar.service;

import java.util.List;

import com.pazar.model.ProductType;

public interface ProductTypeService {

	ProductType saveProductType(ProductType productType);
	List<ProductType> listProductType();
	void deleteProductType(int id);
	ProductType getProductType(int id);
	
}
