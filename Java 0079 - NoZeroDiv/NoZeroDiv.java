/* 
  - From pg. 177 of "Java: A Beginner's Guide - Sixth Edition"
  - Prevent division by zero with the ? operator
  -	Created 09.26.2017 by CB Fay
*/

class NoZeroDiv {
	public static void main(String[] args) {
		int result;
		
		for(int i = -5; i < 6; i++) {
			result = i != 0 ? 100 : 0;
			if (i != 0)
				System.out.println("100 / " + i + " is " + result);
		}
	}
}