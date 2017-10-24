/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Calculates powers of 2 using a while loop
	-	Created 09.10.2017 by CB Fay
*/

class Power
{
	public static void main(String args[])
	{
		System.out.println();
		int e;
		int result;
		
		for(int i = 0; i <= 10; i++)
		{
			result = 1;
			e = i;
			while (e > 0)
			{
				result *= 2;
				e--;
			}
		System.out.println("2 to the " + i + " power is " + result);
		}
	}
}