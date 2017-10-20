/*
 * Each line counts to one more than the last line.
 * Created 09.02.2017 by CB Fay
 */

public class PyrCounter
{
	public static void main(String[] args)
	{
		System.out.println();
		int limit;
		int current;
		
		for(limit = 1; limit < 10; limit++)
		{
			for(current = 1; current <= limit; current++)
			{
				System.out.print(current + " ");
			}
			System.out.println();
		}	
	}
}
/*	
	Post Program Thoughts:
	-	The goal of this program was to practice writing for loops
		after my last program showed me that it was an area of weakness.
	-	One mistake I made this time was adding ";" to the end of the class
		declaration.
	-	I also forgot to add curly braces to create a new scope for my second
		for loop.
*/