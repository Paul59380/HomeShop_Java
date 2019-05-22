package com.genly.miam;

public class Four {
    private int capacity;
    private int power;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cook(Aliment aliment) {
        System.out.println("Je cuis un aliment : " + aliment.name);
        System.out.println("avec ma capcité de " + capacity + " litres");
        System.out.println("et ma puissance de " + power + " degrés");
        aliment.isCooked = true;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }
}
