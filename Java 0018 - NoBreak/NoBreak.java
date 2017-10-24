/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates the "Switch" control statement without a "break statement"
	-	Created 09.08.2017 by CB Fay
*/

public class NoBreak
{
	public static void main(String args[])
	{
		int i;
		
		for(i = 0; i < 5; i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("i is less than one");
				case 1:
					System.out.println("i is less than two");
				case 2:
					System.out.println("i is less than three");
				case 3:
					System.out.println("i is less than four");
				case 4:
					System.out.println("i is less than five");
			}	
			System.out.println();
		}	
	}

}