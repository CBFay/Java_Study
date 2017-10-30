/*
  - Inspired by CS50 2017 - Lecture 3
  - Uses recursion to find the sum of every positive integer < n
  - Created 09.23.2017 by CB Fay
*/

import java.util.Scanner;

class Sigma1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//it's necessary to create a new object of the same class to call non-static methods
		Sigma1 S = new Sigma1();
		int n;

		//get an int from the user
		System.out.print("What is n? ");
		n = input.nextInt(); // positive integer


		// make sure that n won't do anything weird with negatives
		if(n>1) {
			int answer = S.sigma(n);
			System.out.println("Sigma of "+n+"is"+answer);
		}
	}	

	//a method that sums every positive integer < n using recursion
	public int sigma(int m) {
		if(m<0)
			return 0;
		else {
			int sum = (m+sigma(m-1)); // a method can call itself without using an object
			return sum;
		}
	}
}
