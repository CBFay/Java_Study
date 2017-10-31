/*
	-	From pg. 167 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Uses the bitwise & operator to turn subtract 32 from the value of chars by removing the 6th bit
	-	Created 09.24.2017 by CB Fay
*/

class UpCase {
	public static void main(String[] args) {
		char ch;

		for(int i=0; i<10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			// this statement turns off the 6th bit
			ch = (char) ((int) ch & 65503); // ch is now uppercase

			System.out.print(ch + " ");
		}
	}
}
