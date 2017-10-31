/**
 * Learning the functionality of ListIterator objects
 * created 10.25.2017 by CB Fay
 */

import java.util.*;

public class ListIteratorDemo {
		
	public static void main(String[] args) {
		
		// notice that "List" is creat
		List<String> structure = new LinkedList<String>();
		
		// leaving out the "<String>" can prevent compiling because Java doesn't know that you're using the collection safely
		ListIterator<String> location = structure.listIterator();
		
		
		System.out.println(location.hasPrevious()); // false
		location.add("hello"); // inserts to the left of the iterator
		System.out.println(location.hasPrevious()); // now true
		System.out.println(location.hasNext() + "\n"); // false
		
		location.add("there");
		System.out.println(location.hasNext()); // still false
		System.out.println(location.previous()); // returns the element, AND moves the iterator backwards
		System.out.println(location.previous() + "\n");

		location.add("why");
		location.previous();
		
		while (location.hasNext()) 
			System.out.println(location.next());
		System.out.println();
		
		while (location.hasPrevious())
			location.previous(); // move to the far left of the list.
		location.set("oh"); // replaces the last element returned by next() or previous().
		
		while (location.hasNext()) 
			System.out.println(location.next());
		System.out.println(); // we're at the far right.
		
		location.remove(); // Removes the last element that was returned by next() or previous().
		while (location.hasPrevious()) // traversing the list in reverse
			System.out.println(location.previous());
		System.out.println();
		
		System.out.println(location.previousIndex()); // -1
		
		while (location.hasNext()) {
			location.next();
			System.out.println(location.previousIndex()); // indexes
		}
		System.out.println();
		
		while (location.hasNext())
			location.next(); // go to the right
		
		
		location.add("how");
		location.add("are");
		location.add("you");
		location.add("on");
		location.add("this");
		location.add("fine");
		location.add("day?");
		
		while (location.hasPrevious()) // go all the way to the left
			location.previous();
			System.out.println("\ngo to beginning?\n");
			
		while (location.hasNext())
			System.out.println(location.next());
		
	}
}
