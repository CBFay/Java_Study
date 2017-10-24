/*
	-	From pg 49 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates the relational and logical operators
	-	Created 09.11.2017 by CB Fay
*/

public class RelLogOps
{
	public static void main(String[] args)
	{
		int i, j;
		boolean b1, b2;
		
		i = 10;
		j = 11;
		if (i < j) System.out.println("i < j"); 					//true
		if (i <= j) System.out.println("i <= j");					//true
		if (i != j) System.out.println("i != j");					//true
		if (i == j) System.out.println("This won't execute");		//false
		if (i >= j) System.out.println("This won't execute");		//false
		if (i > j) System.out.println("This won't execute");		//false

		b1 = true;
		b2 = false;
		if(b1 & b2) System.out.println("This won't execute");		//false
		if(!(b1 & b2)) System.out.println("!(b1 & b2) is true!");	//true
		if(b1 | b2) System.out.println("(b1 | b2) is true!");		//true
		if(b1 ^ b2) System.out.println("(b1 ^ b2) is true!");		//true
	}
}