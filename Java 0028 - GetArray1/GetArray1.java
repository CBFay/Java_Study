/*
	-	Used to practice using the Scanner object and arrays.
	-	Created 09.10.2017 by CB Fay
*/

import java.util.Scanner;

public class GetArray1
{
	//collect an array of 10 ints, and find the biggest single value.
	public static void main(String args[])
	{
		//make some space and declare key objects
		System.out.println();
		int[] arthur = new int[10];
		Scanner sozin = new Scanner(System.in);
	
		// collect ints for each element in the arthur
		for(int i = 0; i < 10; i++) 
		{
			System.out.print("Give me [" + i + "] of arthur: ");
			arthur[i] = sozin.nextInt();
		}
		
		// find the biggest element in arthur
		int max = arthur[0];
		for(int j = 1; j < arthur.length; j++) // iterate over every element in arthur
		{
			if(arthur[j] > max) max = arthur[j]; 
		}
		System.out.println("\n...\n");
		System.out.println("The largest element in arthur is " + max);
	}
}
