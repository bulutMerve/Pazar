package com.pazar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pazar.model.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Integer> {

}
