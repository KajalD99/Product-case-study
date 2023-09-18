package com.task.catalogMicroservice.Service;


import com.task.catalogMicroservice.Model.ProductDetails;
import com.task.catalogMicroservice.Repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProductService {

    @Autowired
    ProductRepo productRepo;



    public List<ProductDetails> getAllProducts(){
        return productRepo.findAll();
    }

    public String addProductDetails(ProductDetails productDetails){
        productRepo.insert(productDetails);
        return "Added Successful";
    }

    public String deleteProductDetails(String id){
        productRepo.deleteById(id);
        return "Deleted Successfully by Id";
    }

    public Optional<ProductDetails> getById(String id){
        return productRepo.findById(id);

    }

    public ProductDetails getByName(String productName){
        return productRepo.findByProductName(productName);

    }

    public List<ProductDetails> getByProductType(String productType){
        return productRepo.findByProductType(productType);
    }

    public List<ProductDetails> getByPrice(double price){
        return productRepo.findByPrice(price);
    }


}
