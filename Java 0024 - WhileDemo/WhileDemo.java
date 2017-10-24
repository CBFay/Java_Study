/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates the "while" loop
	-	Created 09.09.2017 by CB Fay
*/

public class WhileDemo
{
	public static void main(String args[])
	{
		char letter = 'a';
		
		// print the alphabet using a while loop
		while(letter <= 'z')
		{
			System.out.println(letter);
			letter++;
		}
	}
}