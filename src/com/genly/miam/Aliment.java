package com.genly.miam;

public class Aliment {
    String name;
    boolean isCooked;

    public void eat() {
        if(isCooked) {
            System.out.println("Miam miam ! Cet aliment : " + name + " est bien cuit !");
        } else {
            System.out.println("BEUUURK degeulasse cet aliment : " + name + "est cru !");
        }
    }
}
