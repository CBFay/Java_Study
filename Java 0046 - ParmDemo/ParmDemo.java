/*
	-	From pg. 116 of "Java: A Beginner's Guide - Sixth Edition"
	-	Calls ChkNum to see if parameters are even numbers
	-	Created 09.18.2017 by CB Fay
*/

class ParmDemo {
  public static void main(String[] args) {
    ChkNum e = new ChkNum();

    if(e.isEven(10)) System.out.println("10 is even");
    if(e.isEven(9)) System.out.println("9 is even");
    if(e.isEven(8)) System.out.println("8 is even");
  }
}
