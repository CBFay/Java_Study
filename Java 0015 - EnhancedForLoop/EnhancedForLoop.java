/**
 * created 09.07.2017 by CB Fay
 * completed on 10.23.2017
 * demonstrates the "for-each" style loops
 */

public class EnhancedForLoop
{
	public static void main(String[] args)
	{
		int[] numbers = new int[] { 5, 3, 2, 6, 8, 4, 2, 7, 8 };
		
		// the following loops accomplish the same task
		
		for (int i=0; i < numbers.length; i++) 
		{
			System.out.println("Element: " + numbers[i]);
		}

		System.out.println();
		
		// element actually assumes the value of each item it iterates over
		for (int element : numbers) 
		{
			System.out.println("Element: " + element);
		}
	}		
}
