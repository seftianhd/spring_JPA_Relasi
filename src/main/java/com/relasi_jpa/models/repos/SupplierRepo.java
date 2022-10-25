package com.relasi_jpa.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.relasi_jpa.models.entities.Supplier;

public interface SupplierRepo extends CrudRepository<Supplier, Long>{
    
}
