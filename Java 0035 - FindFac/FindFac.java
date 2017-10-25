/*	-	From pg 99 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Use nested loops to find factors of numbers
	-	Created 09.12.2017 by CB Fay
*/

public class FindFac {
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100; i++) {
			System.out.print("Factors of " + i + ": ");
			for(int j = 2; j < i; j++)
				if((i%j) == 0) System.out.print(j + " ");
			System.out.println();
		}
	}
}