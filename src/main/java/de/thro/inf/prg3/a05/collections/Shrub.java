package de.thro.inf.prg3.a05.collections;

public class Shrub extends Plant {

    public Shrub(double height, String name, String family, PlantColor color) {
        super(height, family, name, color);
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }
}
