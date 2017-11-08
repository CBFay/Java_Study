/**
 * Study of big O notation
 * From Gayle Laakman McDowell's "Cracking the Coding Interview"
 * created 11.08.2017 by CB Fay
 */

class BigODemo {
	
	public static void main(String[] args) {
		int[] test = new int[] { 3, 4, 6, 2, 7, 4, 8, 9 };
		int[] test2 = new int[] { 3, 4, 6 };
		// foo(test);
		// printPairs(test2);
	}
	
	// Example 1 : Prints the sum and product of all of the elements in an int array
	static void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ", " + product);
	}
	// O(n)
	
	// Example 2 : Prints every possible pair of two elements found in the array, even using elements twice
	static void printPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	// Example 3
	void printUnorderedPairs(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				System.out.println(array[i] + array[j]);
			}
		}
	}
	// The sum of integers 1 through N: N(N-1)/2
	// O((n^2)/2) == O(n^2)
	
	// Example 4
	void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}
	// O(ab)
	
	// Example 5
	void printUnorderedPairs2(int[] arrayA, int[] arrayB) {
		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				for (int k = 0; k < 100000; k++) { // this is still just constant time work
					System.out.println(arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}
	// O(ab)
	
	// Example 6
	void reverse(int[] array) {
		for (int i = 0; i < array.length/2; i++) {
			int other = array.length - i - 1;
			
			// swap
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}
	// O(n) - the bigO time isn't affected by the fact that only half of the array is iterated over.
	
}