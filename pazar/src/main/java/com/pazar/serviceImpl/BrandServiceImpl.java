package com.pazar.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pazar.model.Brand;
import com.pazar.repository.BrandRepository;
import com.pazar.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand SaveBrand(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public List<Brand> listBrand() {
		return (List<Brand>) brandRepository.findAll();
	}

	@Override
	public void deleteBrand(int id) {
		brandRepository.deleteById(id);
		
	}
	

}
