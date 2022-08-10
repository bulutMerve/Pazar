package com.pazar.service;

import java.util.List;

import com.pazar.model.Company;

public interface CompanyService {
	Company saveCompany(Company company);

	List<Company> listCompany();

	void deleteCompany(int id);

	Company getCompany(int id);
}
