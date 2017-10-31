/**
 * from https://www.youtube.com/watch?v=rW2OppsgJjQ
 * practice with linked lists
 * created 10.24.2017 by CB Fay
 */

import java.util.*;

class ListDemo {

	public static void main(String[] args) {
		
		String[] fruits = new String[] {"apples", "bananas", "blueberries", "raspberry", "kiwi" };
		List<String> food = new LinkedList<String>();
		
		for (String x : fruits) 
			food.add(x);
		
		String[] vegetables = new String[] {"carrots", "potatoes", "asparagus", "cucumbers", "peppers" };
		List<String> moreFood = new LinkedList<String>();
		
		for (String x : vegetables)
			moreFood.add(x);
		
		food.addAll(moreFood);
		moreFood = null;
		
		printMe(food);
		removeStuff(food, 2,5);
		printMe(food);
		reverseMe(food);
	
	}
	
	// printMe method
	private static void printMe(List<String> list) {
		for (String b : list)
			System.out.printf("%s ", b);
		System.out.println();
	}	
	
	// removeStuff method
	private static void removeStuff(List<String> list, int from, int to) {
		list.subList(from, to).clear();
	}
	
	// reverseMe method
	private static void reverseMe(List<String> list) {
		ListIterator<String> bobby = list.listIterator(list.size());
		while (bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}
	
}