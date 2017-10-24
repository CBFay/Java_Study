/*
	-	My first use of a switch statement
	-	Created 09.06.2017 by CB Fay
*/

public class SwitchTest
{
	public static void main(String args[])
	{
		int i = 1;
		
		switch(i)
		{
			case 0:
				System.out.println("Int i is 0");
				break;
			case 1:
				System.out.println("Int i is 1");
				break;
			default:
				System.out.println("Int i isn't 1 or 2.");
		}		
	}
}