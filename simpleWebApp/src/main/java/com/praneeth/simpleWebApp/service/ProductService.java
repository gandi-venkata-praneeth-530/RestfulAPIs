package com.praneeth.simpleWebApp.service;

import com.praneeth.simpleWebApp.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<product> products = new ArrayList<>(Arrays.asList(new product(101,"Iphone",50000),
            new product(102,"canon camera",40000),
            new product(103,"shure mic",10000)));
    public List<product> getroducts() {
        return products;
    }
public product getproductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst().orElse(new product(100,"No Item",0));
}

    public void addproduct(product prod) {
        products.add(prod);
    }

    public void updateproduct(product prod) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == prod.getId()) {
                products.set(i, prod); // ✅ Update only the matched index
                return; // ✅ Exit after updating
            }
        }
    }


    public void deleteproduct(int id) {
        int index=0;
        for(int i=0; i<products.size(); i++) {
            if (products.get(i).getId() == id) {
                index = i;
            }
        }
        products.remove(index);
    }

    public List<product> getproducts() {
        return products;
    }
}
