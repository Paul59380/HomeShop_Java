package com.genly.garage;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicule {
    private int door;
    private int litrePer100km;
    private String motor;
    private List<String> options = new ArrayList<String>();

    public Car(String description, String manufacturer, int speed, int year, String modelName, String color,
               int[] dimensions, int weight) {
        super(description, manufacturer, speed, year, modelName, color, dimensions, weight);
    }

    public Car(String description, String manufacturer, int speed, int year, String modelName, String color,
               int[] dimensions, int weight, int door, int litrePer100km, String motor, List<String> options) {
        super(description, manufacturer, speed, year, modelName, color, dimensions, weight);
        this.door = door;
        this.litrePer100km = litrePer100km;
        this.motor = motor;
        this.options = options;
    }

    public void startHeadLight() {
        System.out.println("J'allume mes feu");
    }

    public void openTrunk() {
        System.out.println("J'ouvre mon coffre");
    }

    public int getDoor() {
        return door;
    }

    public int getLitrePer100km() {
        return litrePer100km;
    }

    public String getMotor() {
        return motor;
    }

    public List<String> getOptions() {
        return options;
    }
}
