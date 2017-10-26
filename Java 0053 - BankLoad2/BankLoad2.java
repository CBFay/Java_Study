/*
	-	Demonstrates iterating over multi-dimensional arrays with for loops
	- 	Calculates the position of elements in a three dimensional array
	-	Created 09.20.2017 by CB Fay
*/

class BankLoad2 {
	public static void main(String[] args) {

		//creates a 3x4x5 array called "bank" of element type int
		int[][][] bank = new int[4][5][6];

		//represent each dimension in the array "bank"
		int a, b, c;

		//iterates over the first dimension
		for(a = 0; a < bank.length; a++) {

		//iterates over the second dimension
			for(b = 0; b < bank[0].length; b++) {

			//iterates over the third dimension
				for(c = 0; c < bank[0][0].length; c++) {

					//this is my favorite part of this code
					//find the position of the element and assign it that value
					bank[a][b][c] = (a * (bank[0][0].length)) * (bank[0].length) +
					(b * (bank[0][0].length))                    +
					(c);
				}
			}
		}
		//prints out the value of each element in the array
		for(a = 0; a < bank.length; a++) {
			for(b = 0; b < bank[0].length; b++) {
				for(c = 0; c < bank[0][0].length; c++) {
					System.out.println("Bank["+a+"]["+b+"]["+c+"] is " + bank[a][b][c]);
				}
			}
		}
	}
}
