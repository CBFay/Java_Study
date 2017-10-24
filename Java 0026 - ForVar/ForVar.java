/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Declares the loop control variable inside the for
	-	Created 09.09.2017 by CB Fay
*/

public class ForVar
{
	public static void main(String args[])
	{
		int sum = 0;
		int fact = 1;
		
		for(int i = 1; i <= 5; i++) // computes the factorial of the numbers through 5.
		{
			sum += i; // i is known throughout the loop
			fact *= i;
		}
		// but is not known here
		
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);
	}
}