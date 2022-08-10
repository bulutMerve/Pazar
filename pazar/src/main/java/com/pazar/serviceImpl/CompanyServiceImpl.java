package com.pazar.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pazar.model.Company;
import com.pazar.repository.CompanyRepository;
import com.pazar.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> listCompany() {
		return (List<Company>) companyRepository.findAll();
	}

	@Override
	public void deleteCompany(int id) {
		companyRepository.deleteById(id);

	}

	@Override
	public Company getCompany(int id) {
		return companyRepository.findById(id).get();

	}

}