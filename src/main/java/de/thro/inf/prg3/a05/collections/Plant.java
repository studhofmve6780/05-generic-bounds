package de.thro.inf.prg3.a05.collections;

import java.awt.*;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;
    private PlantColor color;

    public Plant(double height, String family, String name, PlantColor color) {

        this.height = height;
        this.family = family;
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        return;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor() {
        return null;
    }

}
