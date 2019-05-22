package com.genly.garage;

public class Vehicule {
    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    private String modelName;
    private String color;
    private int[] dimensions;
    private int weight;

    public Vehicule (String description, String manufacturer, int speed, int year,
                     String modelName, String color, int[] dimensions, int weight) {
        this.description = description;
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.year = year;
        this.modelName = modelName;
        this.color = color;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public void start() {
        System.out.println("Je suis " + modelName + " et je démarre");
    }

    public void stop() {
        System.out.println("Je suis " + modelName + " et je m'arrête");
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }
}
