/*
	-	Taken from: https://www.javatpoint.com/Scanner-class
	-	This program demonstrates the Scanner class
	-	Created 09.05.2017 by CB Fay
*/

import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an int");
		int rollno = sc.nextInt();
		
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your fee");
		double fee = sc.nextDouble();
		
		System.out.println("Rollno: " + rollno);
		System.out.println("Name: " + name);
		System.out.println("Fee: " + fee);
		
		sc.close();
	}
}
	