package com.relasi_jpa.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relasi_jpa.models.entities.Product;
import com.relasi_jpa.models.entities.Supplier;
import com.relasi_jpa.models.repos.ProductRepo;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return productRepo.save(product);
    }

    public Product findOne(Long id){
        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
        productRepo.deleteById(id);
    }

    public void addSupplier(Supplier supplier, Long productId){
        Product product = findOne(productId);
        if(product == null){
            throw new RuntimeException("Product with id "+productId+" not found");
        }
        product.getSuppliers().add(supplier);
        save(product);
    }

    public Product finByProductName(String name){
        return productRepo.finProductByName(name);
    }
}
