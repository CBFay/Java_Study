/*
 * Each line counts to one less than the previous line.
 * Created 09.02.2017 by CB Fay
 */

public class InvPyrcounter
{
	public static void main(String[] args)
	{	
		System.out.println();
		int limit;
		int current;
		
		for(limit = 10; limit > 1; limit--)	
		{	
			for(current = 1; current < limit; current++)
			{
				System.out.print(current + " ");
			}
			System.out.println();
		}
	}
}
/*
	Post Program Notes:
	-	I got really frustrated here because I took a long time to
		correctly implement for loops. My problem was that I was adding
		unnecessary ";"s to the end of the line, sometimes inside the ")",
		sometimes outside.
	-	Likewise, I need to remember that the condition expression must be
		true for the loop to continue iterating; it means "if", not "until".
*/


