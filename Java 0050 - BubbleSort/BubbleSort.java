/*
	-	Uses bubble sort to sort an array of 10 ints
	- ".length" is extremely important
	-	Created 09.20.2017 by CB Fay
*/

class BubbleSort {
	public static void main(String[] args) {
		int a, b, temp, size;
		int[] bank = {1,4,3,2,5,7,6,8,9,0};
		size = bank.length; // .length refers to a property of "bank"

		System.out.println(); // clear some space

		// Print the contents of the unsorted array
		System.out.print("Unsorted:\t");
		for(a = 0; a < bank.length; a++) { // use "a" to iterate over each element in "bank"
		System.out.print(bank[a] + ", "); // print the value of the current element in "bank"
		}
		System.out.println(); // clear some space

		// THIS is the Bubble Sort algorithm
		for(a = 1; a < bank.length; a++) { // do the following one less time than the amount of elements in "bank"
			for(b = 0; b < bank.length - a; b++) { // do the following until the current position ("b") is equal to the boundary between unsorted and sorted
				if(bank[b] > bank[b+1]) { // if the current element is larger than the next element...
					temp = bank[b]; bank[b] = bank[b+1]; bank[b+1] = temp; // swap the two values triangularly using a third memory slot, "temp"
				}
			}
		}

		// Print the contents of the newly sorted array
		System.out.print("Sorted:\t\t");
		for(a = 0; a < bank.length; a++) { // recycle "a" to iterate over each element in "bank"
			System.out.print(bank[a] + ", "); // print the value of the current element in "bank"
		}
		System.out.println(); // clear some space
	}
}
