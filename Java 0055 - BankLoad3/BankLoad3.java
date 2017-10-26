/*
	-	Demonstrates iterating over multi-dimensional arrays with for loops
	- 	Uses a counter variable and a 4 dimensional array
	-	Created 09.20.2017 by CB Fay
*/

class BankLoad3 {
	public static void main(String[] args) {

		//creates a 3x4x5 array called "bank" of element type int
		int[][][][] bank = new int[3][4][5][6];

		//represent each dimension in the array "bank"
		int a, b, c, d;
		int counter;

		//iterates over the first dimension
		for(counter = 0, a = 0; a < bank.length; a++) {

			//iterates over the second dimension
			for(b = 0; b < bank[0].length; b++) {

				//iterates over the third dimension
				for(c = 0; c < bank[0][0].length; c++) {

					//iterates over the fourth dimension
					for(d = 0; d < bank[0][0][0].length; d++) {

						//this is the easier way
						//assign the element a value based on "counter"
						bank[a][b][c][d] = counter;
						counter++;
					}
				}
			}
		}
		
		//prints out the value of each element in the array
		for(a = 0; a < bank.length; a++) {
			for(b = 0; b < bank[0].length; b++) {
				for(c = 0; c < bank[0][0].length; c++) {
					for(d = 0; d < bank[0][0][0].length; d++) {
						System.out.println("Bank["+a+"]["+b+"]["+c+"]["+d+"] is " + bank[a][b][c][d]);
					}
				}
			}
		}
	}
}
