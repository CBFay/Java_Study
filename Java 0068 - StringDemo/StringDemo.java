/*
	-	From pg. 159 of "Java: A Beginner's Guide - Sixth Edition"
	-	Demonstrates multiple ways to construct a String object
	-	Created 09.24.2017 by CB Fay
*/

class StringDemo {
	public static void main(String[] args) {
		//declare Strings in various ways
		String str1 = new String("In Java, Strings are objects.");
		String str2 = "They are constructed in various ways";
		String str3 = new String(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
