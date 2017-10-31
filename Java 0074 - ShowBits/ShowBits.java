/*
	-	From pg. 168 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Display the bits within a byte
	-	Created 09.24.2017 by CB Fay
*/

class ShowBits {
	public static void main(String[] args) {
		int t;
		byte val;

		val = 123;
		for(t = 128; t>0; t/=2) {
			if((val & t) != 0) System.out.print("1 ");
			else System.out.print("0 ");
		}
	}
}
