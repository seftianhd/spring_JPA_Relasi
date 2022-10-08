package com.relasi_jpa.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.relasi_jpa.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
}
