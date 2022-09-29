package Model;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
}

