package com.genly;


import com.genly.Paris.Bus;
import com.genly.Paris.Parisien;
import com.genly.homeshop.*;

public class Main {
    public static void main(String[] args) {
       /* Product cafe = new Product("Phillips HD7888546/61",
                "Phillips SENSEO Quandrante Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung D6R27-H59P", "Smart TV LED incurvée 49\"",
                1000, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigirateur BEKO 130L -Classe A - Blanc",
                1809, 130, false);

        Customer customer = new Customer("Juste Leblanc", "19 rue Germain Pilon, Paris");

        Bill bill = new Bill(customer);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);*/
        Parisien nekfeu = new Parisien();
        Bus bus = new Bus();
        nekfeu.seDeplacer(bus, "19 rue du paradis à Dunkerque 59140");
    }
}
