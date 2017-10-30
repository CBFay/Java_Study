/*
	-	From pg. 165 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Display all command-line information
	-	Created 09.24.2017 by CB Fay
*/

class CLDemo {
	public static void main(String[] args) {
		System.out.println("There are " + args.length +  " command line arguments.");

		System.out.println("They are: ");
		for(int i=0; i<args.length; i++)
			System.out.println("args[" + i + "] : " + args[i]);
	}
}
