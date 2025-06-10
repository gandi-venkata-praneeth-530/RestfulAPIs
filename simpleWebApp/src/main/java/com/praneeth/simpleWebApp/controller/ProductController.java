package com.praneeth.simpleWebApp.controller;

import com.praneeth.simpleWebApp.model.product;
import com.praneeth.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<product> getproducts() {
        return service.getproducts();
    }
    @GetMapping("/products/{id}")

    public product getproductById(@PathVariable int id) {
        return service.getproductById(id);
    }
    @PostMapping("/products")
    public void addproduct(@RequestBody product prod) {
        service.addproduct(prod);
    }
    @PutMapping("/products")
    public void updateproduct(@RequestBody product prod) {
        service.updateproduct(prod);
    }
    @DeleteMapping("/products/{id}")
    public void deleteproduct(@PathVariable int id) {
        service.deleteproduct(id);
    }
}
