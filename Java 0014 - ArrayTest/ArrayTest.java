/*
	-	I made this program to practice implementing arrays.
	-	Created 09.06.2017 by CB Fay
*/

import java.util.Scanner;

public class ArrayTest
{
	public static void main(String[] args)
	{
		System.out.print("Assign a value to numbers[3] : ");

		Scanner AV = new Scanner(System.in);
		int value = AV.nextInt();
		
		int[] numbers = new int[10]; // declares an array that holds 10 variables of type int.
		
		numbers[3] = value; // in the third element of the array "numbers", give 7.
		System.out.println("The third element of numbers is " + numbers[3]); // print the third element of "arry".
	}
}
// lookup "enhanced java loop"