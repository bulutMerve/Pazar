package com.pazar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pazar.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {

}

