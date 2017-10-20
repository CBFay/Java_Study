/*
 * From "Java: A Beginner's Guide - Sixth Edition" 
 * Demonstrates the Modulus Operator.
 * Created 09.04.2017 by CB Fay
 */

public class ModDemo
{
	public static void main(String[] args)
	{
	System.out.println("..."); //Create space between CMD line and the program.
		
		int iresult, irem;
		double dresult, drem;
		
		iresult = 15/2;		irem = 15%2;
		dresult = 15/2;		drem = 15%2;
		
		System.out.println
		("Int Result and Remainder of (15 / 2) = " + iresult + " and " + irem);
		
		System.out.println
		("Double Result and Remainder of (15 / 2) = " + dresult + " and " + drem);
	}
}

/*
	-	I wonder to what degree design is flexible in the programming world. 
		I find myself wanting to break guidelines to make the code look 
		or feel better, but I'm hesitant to go too far against the grain and not
		be understood.
*/