/*
	-	I made this program to practice implementing Concatenation
	-	Created 09.06.2017 by CB Fay
*/

import java.util.Scanner;

public class CombineString 
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Word 1: ");
		String word1 = read.nextLine();
		
		System.out.print("Word 2: ");
		String word2 = read.nextLine();
		
		System.out.print("Both : ");
		String both = (word1 + word2); // This is called "Concatenation"
		
		System.out.println(both);
	}
}