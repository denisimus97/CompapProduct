package com.company;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Product> comparator = new ProductCountComparator().thenComparing(new ProductNameComparator());

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("a", 2));
        products.add(new Product("c", 2));
        products.add(new Product("z", 2));
        products.add(new Product("b", 2));
        products.add(new Product("b", 3));
        products.add(new Product("b", 4));
        products.add(new Product("b", 5));
        products.add(new Product("a", 5));

        products.sort(comparator);

        for (Product product : products) {
            System.out.println(product.getName() + " : " + product.getCount());
        }
    }
}

class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}