/*	-	From pg 88 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Read input until a q is received
	-	Created 09.12.2017 by CB Fay
*/

public class Break2
{
	public static void main(String[] args)
		throws java.io.IOException
	{	
		System.out.println("\nGuess a letter: ");
		char ch; 
		
		for(; ;)
		{
			ch = (char) System.in.read(); // get a char
			if (ch == 'q') break;
		}
		System.out.println("You pressed q!");
	}
}