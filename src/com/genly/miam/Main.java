package com.genly.miam;

public class Main {
    public static void main(String[] args) {
        Four grandFour = new Four();

        Aliment cake = new Aliment();
        cake.name = "cake aux fruit";
        cake.isCooked = false;
        cake.eat();


        grandFour.cook(cake);
        cake.eat();
    }
}
