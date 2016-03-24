package com.example.jake.helloworld1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Pz_data {

    public static List<Product> productList = new ArrayList<>();
    public static Map<String, Product> productMap = new HashMap<>();

    static {

        addProduct("shirt101",
                "Margarita",
                "Pizza sauce with 100% mozzarella",
                3.25);

        addProduct("jacket101",
                "Chargrilled Chicken",
                "Chargrilled chicken and onions",
                3.50);

        addProduct("pants101",
                "Pepperoni",
                "Just pepperoni",
                3.50);

        addProduct("shirt102",
                "Ham & Pineapple",
                "Pizza sauce with 100% mozzarella, ham & pineapple",
                3.50);

        addProduct("shirt103",
                "Spicey Veg (V)",
                "Chargrilled courgette, aubergine, red & yellow peppers",
                3.50);
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
