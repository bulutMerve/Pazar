package com.pazar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pazar.model.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

}
