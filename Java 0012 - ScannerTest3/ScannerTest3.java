/*
	-	I made this program to practice implementing Scanners
	-	Created 09.06.2017 by CB Fay
*/

import java.util.Scanner;

public class ScannerTest3
{
	public static void main(String[] args)
	{
		System.out.print("Say something: "); //prompt the user for input
		
		Scanner GetLine = new Scanner(System.in); //declare a Scanner
		String Line = GetLine.nextLine(); //declare String variable and assign it everything the user types before hitting enter
		
		System.out.print("The something is: " + Line);
	}
}