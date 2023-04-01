package com.maheen.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maheen.productservice.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findProductById(String productId);
}
