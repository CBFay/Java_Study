/*
	-	From pg. 157 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Use a for each style loop on a two dimensional array
	-	Created 09.21.2017 by CB Fay
*/

class ForEach2 {
	public static void main(String[] args) {
		int sum = 0;
		int nums[][] = new int[3][5];

    // I should create a method that can assign a single value to every element in an array
    for(int i=0; i<nums.length; i++) {
        for(int j=0; j<nums[0].length; j++) {
			nums[i][j] = 1;
        }
    }

    // I really don't like how this can't be used to assign values to an array.
    for(int[] a : nums) {
		for(int b : a) {
			System.out.println("Value is: " + b);
			sum += b;
		}
    }

    System.out.println("Summation: " + sum);
  }
}
