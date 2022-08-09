package com.pazar.service;

import java.util.List;
import com.pazar.model.Brand;

public interface BrandService {
	Brand SaveBrand (Brand brand);
	List<Brand> listBrand();
	void deleteBrand(int id);
	Brand getBrand(int id);
}
