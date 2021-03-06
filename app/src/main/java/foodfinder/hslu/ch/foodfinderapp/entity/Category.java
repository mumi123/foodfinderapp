package foodfinder.hslu.ch.foodfinderapp.entity;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;
    private String name;
    private List<Product> products = new ArrayList<>();

    public Category(){};

    public Category(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
