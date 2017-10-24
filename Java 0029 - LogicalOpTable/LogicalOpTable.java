/*
	-	From pg 57 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Creates a truth table for logical operators
	-	Created 09.11.2017 by CB Fay
*/

class LogicalOpTable
{
	public static void main(String[] args)
	{
		System.out.println();
		boolean p, q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		p = true;	q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		p = true;	q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
		
		p = false;	q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t");
	}
}