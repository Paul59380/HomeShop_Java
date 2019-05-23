package com.genly.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * Add a product with a quantity in the bill
     *
     * @param product  product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer write) {
        write.start();
        write.writeLine("HomeShop Compagnie");
        write.writeLine("1 Place Charles de Gaulle, Paris");
        write.writeLine("");
        write.writeLine("Facture à l'intention de : ");
        write.writeLine(customer.getFullName());
        write.writeLine(customer.getAddress());
        write.writeLine("");
        write.writeLine("Mode de livraison :  " + delivery.getInfo());
        write.writeLine("");
        write.writeLine("Produits :");
        write.writeLine("------------------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            write.writeLine(product.getName() + " - " + product.getPrice() + "€ - " + quantity + "unité(s)");
            write.writeLine(product.getDescription());
            write.writeLine("");
        }
        write.writeLine("Livraison : " + delivery.getPrice() + "€");
        write.writeLine("------------------------------------------------------");
        write.writeLine("Total : " + this.getTotal() + "€");
        write.stop();
    }

    public double getTotal() {
        double total = 0;
        for(Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        total += delivery.getPrice();
        return total;
    }
}
