package com.genly;

import com.genly.garage.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Renault Clio III", "Renault", 225, 2005, "Clio III", "Gris métalisé", new int[]{4832, 1720
                ,1497}, 1240, 5, 7, "motor", List.of(new String[]{"Vitre éléectique", "GPS"}));
    }
}
