/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Reads a character from the keyboard.
	-	Created 09.06.2017 by CB Fay
*/

class KeyboardIn
{
	public static void main(String[] args)
	throws java.io.IOException
	{
		char ch;
		
		System.out.print("Press a key followed by ENTER: ");
		
		ch = (char) System.in.read(); // get a char
		
		System.out.println("Your key is: " + ch);
	}
}
