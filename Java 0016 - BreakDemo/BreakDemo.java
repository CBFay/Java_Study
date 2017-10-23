/*
	-	From pg 88 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Using a if statement and a break to exit a loop
	-	Created 09.11.2017 by CB Fay
*/

public class BreakDemo
{
	public static void main(String[] args)
	{
		System.out.println();
		int num = 100;
	
		// loop while i-squared is less than num
		for(int i = 0; i < num; i++)
		{
			if(i*i >= num)
			{
				break; // terminate the loop if i*i >= 100
			}
			
			System.out.println(i);
		}
		System.out.println("Loop complete");
	}
}