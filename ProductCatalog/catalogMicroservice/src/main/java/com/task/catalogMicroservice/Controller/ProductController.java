package com.task.catalogMicroservice.Controller;

import com.task.catalogMicroservice.Model.ProductDetails;
import com.task.catalogMicroservice.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/start")

public class ProductController {

    @Autowired
    ProductService productService;



    @PostMapping("/add")
    public String addProductDetails(@RequestBody ProductDetails productDetails){
        return productService.addProductDetails(productDetails);
    }

    @GetMapping("/get")
    public List<ProductDetails> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductModel(@PathVariable String id){
        return productService.deleteProductDetails(id);
    }

    @GetMapping("/get/{id}")
    public Optional<ProductDetails> getProductById(@PathVariable String id){
        return productService.getById(id);
    }

    @GetMapping("/getByProductName/{name}")
    public ProductDetails getByName(@PathVariable("name") String name){
        return productService.getByName(name);

    }

    @GetMapping("/findByProductType/{productType}")
    public List<ProductDetails> getByProductType(@PathVariable("productType") String productType){
        return productService.getByProductType(productType);
    }


    @GetMapping("/findByPrice/{price}")
    public List<ProductDetails> getByPrice(@PathVariable("price") double price){
        return productService.getByPrice(price);
    }



}
