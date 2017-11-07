/**
 * Experimentation with HashMap functionality
 * Created 11.07.2017 by CB Fay
 */

import java.util.*;

class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> coordinates = new HashMap<String, Integer>();
		
		coordinates.put("A1", 0);
		coordinates.put("A2", 1);
		coordinates.put("A3", 2);
		coordinates.put("A4", 3);
		coordinates.put("A5", 4);
		coordinates.put("A6", 5);
		
		System.out.println(coordinates.get("A1"));
		System.out.println(coordinates.get("A2"));
		System.out.println(coordinates.get("A3"));
		System.out.println(coordinates.get("A4"));
		System.out.println(coordinates.get("A5"));
		System.out.println(coordinates.get("A6"));
		System.out.println();
		
		if (coordinates.containsKey("A2"))
			System.out.println("A2 is a key");
		
		if (coordinates.containsValue(3))
			System.out.println("3 is value\n");
		
		// This is how you would copy all elements from one HashMap to another
		// The documentation seems to suggest otherwise, but this method works
		HashMap duplicate = (HashMap) coordinates.clone();
		
		coordinates.clear();
		System.out.print("Testing key \"A1\" in coordinates: ");
		System.out.println(coordinates.get("A1"));
		
		if (coordinates.isEmpty())
			System.out.println("Coordinates is now empty\n");
		
		
		System.out.print("getting \"A3\" from coordinates: ");
		System.out.println(duplicate.get("A3"));
		
		System.out.print("The size of duplicate is: ");
		System.out.println(duplicate.size());
		
		System.out.print("Getting \"A3\" from duplicate: ");
		System.out.println(duplicate.get("A3"));
		
		HashMap<String, Integer> grid = new HashMap<String, Integer>();
		
		grid.putAll(coordinates);
		System.out.print("getting \"A5\" from grid: ");
		System.out.println(grid.get("A5"));
		System.out.println();
		
		System.out.print("Testing equality of coordinates and duplicate: ");
		System.out.println(coordinates.equals(duplicate));
		System.out.println();

		// for some reason, I can't add values to the duplicate set... unsafe operation
		System.out.println(duplicate.hashCode());
		duplicate.remove("A6");
		System.out.println(duplicate.hashCode());
		
		coordinates.put("A7", 6);
		System.out.println(coordinates.hashCode());
	}
}