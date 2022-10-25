package com.relasi_jpa.models.repos;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.relasi_jpa.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
    @Query("SELECT p FROM Product p WHERE p.name = :name")
    public Product finProductByName(@PathParam("name") String name);
}
