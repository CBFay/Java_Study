/*
  - Inspired by CS50 2017 - Lecture 3
  - Finds the sum of every positive integer < n.
  - Created 09.23.2017 by CB Fay
*/

import java.util.Scanner;

class Sigma0 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//it's necessary to create a new object of the same class to call non-static methods
		p75_Sigma0 S = new p75_Sigma0();
		int n;

		//get an int from the user
		System.out.print("What is n? ");
		n = input.nextInt(); // positive integer


    // make sure that n won't do anything weird with negatives
		if(n>1) {
			int answer = S.sigma(n);
			System.out.println("Sigma of " + n + " is " + answer);
		}
	}

	//a method that sums every positive integer < n (m).
	public int sigma(int m) {
		int sum = 0;
		for(int i = m; i>0; i--) {
			sum += i;
		}

		return sum;
	}
}
