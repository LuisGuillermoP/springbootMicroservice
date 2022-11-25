package com.pariente.productmicroservice.repository;

import com.pariente.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity , String > {
}
