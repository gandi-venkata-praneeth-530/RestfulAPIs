package com.praneeth.simpleWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class product{
    private int id;
    private String prod_name;
    private int price;
    public product() {

    }

    public product(int id, String prod_name, int price) {
        this.id = id;
        this.prod_name = prod_name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public product(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", prod_name='" + prod_name + '\'' +
                ", price=" + price +
                '}';
    }
}
