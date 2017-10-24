/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates a loop that ends when the user gives a specific input
	-	Created 09.09.2017 by CB Fay
*/
	
class ForTest
{
	public static void main(String args[])
		throws java.io.IOException
	{
		int i;
		
		System.out.println("Press s to stop.");
		
		for(i = 0; (char) System.in.read() != 's'; i++)
			System.out.println("Pass #" + i);
	}
}