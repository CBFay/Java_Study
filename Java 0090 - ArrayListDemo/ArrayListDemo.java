/**
 * Understanding the ArrayList object
 * created 10.26.2017 by CB Fay
 */

import java.util.ArrayList;

class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> dynamic = new ArrayList<Integer>(25);
		
		dynamic.add(5);
		dynamic.add(5);
		dynamic.add(6);
		dynamic.add(10);
		dynamic.add(13);
		dynamic.add(13);
		dynamic.add(17);
		dynamic.add(17);
		dynamic.add(18);
		dynamic.add(19);
		dynamic.add(21);
		dynamic.add(21);
		dynamic.add(24);
		dynamic.add(25);
		dynamic.add(26);
		dynamic.add(27);
		dynamic.add(28);
		dynamic.add(28);
		dynamic.add(30);
		dynamic.add(32);
		dynamic.add(32);
		dynamic.add(33);
		dynamic.add(34);
		dynamic.add(34);
		dynamic.add(35);
		
		System.out.println("Before removing duplicates...");
		
		for (int i : dynamic)
			System.out.println(i);
		
		System.out.println();
		
		// the amount of shifting that's being done makes this structure relatively inefficient
		for (int i = 1; i < dynamic.size(); i++) {
			if (dynamic.get(i) == dynamic.get(i-1)) {
				dynamic.remove(i);
			}
			System.out.println(i);
		}
		System.out.println("Duplicates removed.");
		
	}

}