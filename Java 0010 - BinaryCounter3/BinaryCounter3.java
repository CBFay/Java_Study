/*
	-	Accidentally created while trying to improve p02_binarycounter2.java
	-	I created new variables to count, because I wanted the old ones to store user input
	-	Created 09.05.2017 by CB Fay
*/

import java.util.Scanner;

public class BinaryCounter3
{
	public static void main(String[] args)
	{
		double base, degree, target, remain;
		double degreecurrent, targetcheck;
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("\n" + "base: " );
				base = sc.nextDouble();
				// base is the user defined number system.
				
			System.out.println("degree: " );
				degree = sc.nextDouble();
				// degree is the power to which the base will be raised.
		
			System.out.println("target: " );
				target = sc.nextDouble();
				// target is the user defined limit that we want to count up to.
				
		for(targetcheck = 0; targetcheck <= target; targetcheck++)
		{
			targetcheck = target;
			remain = target;
			degreecurrent = degree;
			
			while(degreecurrent > -1)
			{
				if(remain < Math.pow(base, degreecurrent))
				{
					degreecurrent--;
					System.out.print(0);
				}
				else
				{
					remain = remain - Math.pow(base, degreecurrent);
					degreecurrent--;
					System.out.print(1);
				}	
			}
			System.out.println();
		} 
	}
}

/*
Post Program Thoughts:
*/