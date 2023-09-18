package com.task.catalogMicroservice.Repo;

import com.task.catalogMicroservice.Model.ProductDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends MongoRepository<ProductDetails, String> {



   public ProductDetails findByProductName(String productName);

   public List<ProductDetails> findByProductType(String productType);


   public List<ProductDetails> findByPrice(Double price);

   //public Optional<ProductDetails> updateProducts(ProductDetails productDetails);


}