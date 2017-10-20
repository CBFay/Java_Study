/*
 * From "Java: A Beginner's Guide - Sixth Edition" 
 * Demonstrates the Short-Circuit Operators.
 * Created 09.04.2017 by CB Fay
 */

public class SCops
{
	public static void main(String[] args)
	{
		int n, d, q; // numerator, denominator, quotient
		
		n = 10;		d = 5;
		
		if(d != 0 && (n % d) == 0) 
			System.out.println(d + " is a factor of " + n + ".");
			// "&&" won't check the second condition if the first is false, but "&" will.
			// If the short circuit "&" operator wasn't used, a / by zero error could occur.
			
		else
			System.out.println(d + " is not a factor of " + n + ".");
			
	}
	
}