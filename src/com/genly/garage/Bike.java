package com.genly.garage;

public class Bike extends Vehicule {
    public Bike(String description, String manufacturer, int speed, int year,
                String modelName, String color, int[] dimensions, int weight) {
        super(description, manufacturer, speed, year, modelName, color, dimensions, weight);
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
