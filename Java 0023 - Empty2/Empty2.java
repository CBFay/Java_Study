/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates a "for" loop with no body, and gets input from the user
	-	Created 09.09.2017 by CB Fay
*/
import java.util.Scanner;

class Empty2
{
	public static void main(String args[])
	{
		int i;
		int input;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many repetitions? ");
		
		for (i = 1, input = sc.nextInt(); i <= input; sum += i++) ;
		{
			// instead of using curly braces, you could use ";".
		}	
		System.out.println("Sum is " + sum);
	}
}