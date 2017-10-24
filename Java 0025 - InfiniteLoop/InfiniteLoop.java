/*
	-	Produces a seemingly infinite "for" loop that has no initialization, condition, or iteration statements.
	-	Created 09.09.2017 by CB Fay
*/

public class InfiniteLoop
{
	public static void main(String args[])
	{
		int i;
		i = 0;
		
		for(;;)
		{
			System.out.println(i);
			i++;
			if (i > 1_000_000_000) // stop at 1 billion
				break;
		}
	}
}