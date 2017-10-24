/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates a "for" loop with no body.
	-	Created 09.09.2017 by CB Fay
*/

class Empty
{
	public static void main(String args[])
	{
		int i;
		int sum = 0;
		
		for (i = 1; i <= 5; sum += i++) 
		{
			// instead of using curly braces, you could use ";"
		}	
		System.out.println("Sum is " + sum);
	}
}