/*
	-	From pg. 169 of "Java: A Beginner's Guide - Sixth Edition"
	-	Uses the bitwise | operator to lowercase a char
	-	Created 09.24.2017 by CB Fay
*/

class LowCase {
	public static void main(String[] args) {
		char ch;

		for(int i=0; i<10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);

			// this statement turns off the 6th bit
			ch = (char) ((int) ch | 32); // ch is now lowercase

			System.out.print(ch + " ");
		}
	}
}
