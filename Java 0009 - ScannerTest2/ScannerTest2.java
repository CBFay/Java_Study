/*
	-	Taken from: https://www.javatpoint.com/Scanner-class
	-	This program demonstrates the Scanner class
	-	Created 09.05.2017 by CB Fay
*/

import java.util.*;

public class ScannerTest2
{
	public static void main(String[] args)
	{
		String input = "10 tea 20 coffee 30 tea biscuits";
		Scanner s = new Scanner(input).useDelimiter("\\s");
		// "The \s represents whitespace"
		
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		
		s.close();
	}
}