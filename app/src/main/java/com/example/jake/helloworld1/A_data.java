package com.example.jake.helloworld1;

/**
 * Created by Jake on 23/03/2016.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class A_data {

    public static List<Product> productList = new ArrayList<>();
    public static Map<String, Product> productMap = new HashMap<>();

    static {

        addProduct("s", "Filter Coffee", "Boring", 1.20);
        addProduct("ad", "Americano", "Black OR white. Breaking down barriers one coffee at a time", 1.40);
        addProduct("f", "Cappuccino", "It's not 1996", 1.60);
        addProduct("d", "Espresso", "Essay due?", 1.35);
        addProduct("f", "Latte", "So... milk", 1.60);
        addProduct("f", "Mocha", "Just buy a hot chocolate", 1.70);
        addProduct("f", "Flat White", "Get out", 1.60);
        addProduct("f", "Mocchiato", "You're confused", 1.40);
        addProduct("f", "Spiced Chai", "Would you like Uggs with that?", 1.50);
        addProduct("f", "Hot Chocolate", "You're not at summer camp", 1.75);
        addProduct("f", "Breakfast Tea","Basic", 0.90);


    }

    private static void addProduct(String itemId, String name,
                                   String description, double price) {
        Product item = new Product(itemId, name, description, price);
        productList.add(item);
        productMap.put(itemId, item);
    }

    public static List<String> getProductNames() {
        List<String> list = new ArrayList<>();
        for (Product product : productList) {
            list.add(product.getName());
        }
        return list;
    }

    public static List<Product> getFilteredList(String searchString) {

        List<Product> filteredList = new ArrayList<>();
        for (Product product : productList) {
            if (product.getProductId().contains(searchString)) {
                filteredList.add(product);
            }
        }

        return filteredList;

    }

}