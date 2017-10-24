/*
	-	Demonstrates nested "switch" statements and using a Scanner to take user input
	-	Created 09.08.2017 by CB Fay
*/
import java.util.Scanner; // bring in the library that contains the Scanner method

public class NestedSwitch // declaring the current class or program name.
{
	public static void main(String args[]) // delcare the main method, and get an array of strings from the user.
	{
		int a, b; // declare two variables of type "int"
		
		Scanner sc = new Scanner(System.in); // declare a Scanner named "sc" that gets input from System.in
		
		System.out.print("Assign 'int a' a value of 1: "); // prompt the user for input
			a = sc.nextInt();	// use Scanner sc to get a value for int a
				
		System.out.print("Assign 'int b' a value of 1 or 2: "); // prompt the user for input
			b = sc.nextInt();	// get an int again with sc

		switch(a) // check the value of var "a" and execute a statement sequence corresponding to the specific value
		{
			case 1: // if (a == 1) , execute the next block of code
				System.out.print("a is 1, "); // print the first half of output to the user
				switch(b) // check the value of "b", and execute the corresponding statement.
				{
					case 1: // if (b == 1), execute the next statement
						System.out.println("and b is 1 also."); // print the second half of output to the user
						break; // exit the current switch statement
					case 2: // if (b == 2), execute the next statement
						System.out.println("and b is 2."); // print the second half of output to the user
						break; // exit the current switch statement
					default: // If none of the above cases are true, execute the next statement and exit the switch.
						System.out.println("but b is not 1 or 2, try again."); // print the second half of output to the user
				}	
				break;	// exit the current switch statement
			default: // If none of the above cases are true, execute the next statement and exit the switch.
				System.out.println("a is not 1, try again."); // tell the user that they didn't follow instructions.
		}	
	}
}