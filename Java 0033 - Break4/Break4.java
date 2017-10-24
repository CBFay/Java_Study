/*	-	From pg 90 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Using break with a label
	-	Created 09.12.2017 by CB Fay
*/

class Break4
{
	public static void main(String[] args)
	{
		int i;
		
		for(i = 1; i < 4; i++)
		{
one: 		{
two:			{
three:				{
						System.out.println("\ni is " + i);
						if (i == 1) break one;
						if (i == 2) break two;
						if (i == 3) break three;
						
						// this is never reached
						System.out.println("won't print");
					} // break three exits here
					System.out.println("After block three.");
				} // break two exits here
				System.out.println("After block two.");
			} // break one exits here
			System.out.println("After block one.");
		} // if no breaks are triggered, the for loop exits here
		System.out.println("After for.");
	}
}