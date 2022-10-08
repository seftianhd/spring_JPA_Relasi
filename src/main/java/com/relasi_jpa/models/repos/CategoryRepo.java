package com.relasi_jpa.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.relasi_jpa.models.entities.Category;

public interface CategoryRepo extends CrudRepository<Category, Long>{
    
}
