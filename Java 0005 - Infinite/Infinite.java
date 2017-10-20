/*
 * Just an annoying program
 * Created 09.02.2017 by CB Fay
 */

public class Infinite
{
	public static void main(String[] args)
	{
		long n;
		for(n = 0; true; n++)
		{
			System.out.print(n + " ");
		}
	}
}

/*	
	Post Program Thoughts:
	-	Not a very problematic program unless there were several instances
		running simultaneously. 
	-	What is the extent to which a program like this could disrupt a system?
	-	How could a program of the same nature be more elegant?
*/