package de.thro.inf.prg3.a05.collections;

import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class Flower extends Plant {

    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name, color);

        if (color == PlantColor.GREEN)
            throw new IllegalArgumentException("Wrong Color!");
    }

    @Override
    public PlantColor getColor() {
        return null;
    }

}
