package com.genly.garage;

public abstract class Vehicule {
    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    protected String modelName;
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

    public abstract void start();

    public abstract void stop();

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
