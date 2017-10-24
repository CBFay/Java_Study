/*
	-	From pg 85 of "Java: A Beginner's Guide - Sixth Edition" 
	-	An improved Help system that uses a do-while to process a menu selection
	-	Created 09.11.2017 by CB Fay
*/

class Help2
{
	public static void main(String[] Args)
	throws java.io.IOException
	{
		char choice, ignore;
			
		do
		{
			System.out.println("Help on:");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do-while");
			System.out.print(" Choose one: ");
			
			choice = (char) System.in.read();
			
			do
			{
				ignore = (char) System.in.read();
			}
			while (ignore != '\n');
		}
		while (choice < '1' | choice > '5');
		
		System.out.println();
		switch(choice)
		{
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println("\tcase constant:");
				System.out.println("\t\tstatement sequence");
				System.out.println("\t\tbreak;");
				System.out.println("// ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The for:\n");
				System.out.println("for(init; condition; iteration)");
				System.out.println("statement;");
				break;
			case '4':
				System.out.println("The while:\n");
				System.out.println("while(init; condition; iteration)");
				System.out.println("statement;");
				break;
			case '5':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println("statement;");
				System.out.println("} while(condition);");
				break;
		}		
	}
}