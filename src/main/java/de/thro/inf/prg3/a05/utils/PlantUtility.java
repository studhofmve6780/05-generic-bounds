package de.thro.inf.prg3.a05.utils;

import de.thro.inf.prg3.a05.collections.SimpleList;
import de.thro.inf.prg3.a05.collections.SimpleListImpl;
import de.thro.inf.prg3.a05.model.Plant;
import de.thro.inf.prg3.a05.model.PlantBed;
import de.thro.inf.prg3.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Peter Kurfer
 * Created on 11/2/17.
 */
public abstract class PlantUtility {

	private PlantUtility() {
	}

	//shortest variant
	public static <T extends Plant> Map<PlantColor, SimpleList<? extends T>> splitBedByColor(PlantBed<? extends T> plantBed) {
		Map<PlantColor, SimpleList<? extends T>> result = new HashMap<>();
		/* iterate the enum values */
		for (PlantColor color : PlantColor.values()) {
			/* get all plants of the current color */
			result.put(color, plantBed.getPlantsByColor(color));
		}
		return result;
	}
}
