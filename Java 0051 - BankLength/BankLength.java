/*
	-	Demonstrates how to find the length of dimensions in a multi-dimensional array
	- 	What does it mean to change the numbers inside of the square brackets?
	-	Created 09.20.2017 by CB Fay
*/

class BankLength {
  public static void main(String[] args) {

    int[][][][] bank = new int[3][4][5][6]; // a four dimensional array

    System.out.println(bank.length); // get the length of the first array dimension
    System.out.println(bank[0].length); // get the length of the second array dimension
    System.out.println(bank[0][0].length); // get the length of the third array dimension
    System.out.println(bank[0][0][0].length); // get the length of the fourth array dimension

    System.out.println(bank[2][3][4].length); // these are the maximum allowed values for this array's dimensions...
  }
}
