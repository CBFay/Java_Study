/*
	-	Demonstrates iterating over multi-dimensional arrays with for loops
	-	Created 09.20.2017 by CB Fay
*/

class BankLoad {
	public static void main(String[] args) {

		//creates a 3x5 array called "bank" of element type int
		int[][] bank = new int[3][5];

		//represent each dimension in the array "bank"
		int a, b;

		//iterates over the first dimension
		for(a = 0; a < bank.length; a++) {
		//iterates over the second dimension
			for(b = 0; b < bank[0].length; b++) {
			/*assigns  the current element in the "bank" a value representative
			of its position*/
			bank[a][b] = ((bank[0].length * a) + b); // ! assigns  the current element in the "bank" a value representative of its position
			}
		}
		//prints out the value of each element in the array
		for(a = 0; a < bank.length; a++) {
			for(b = 0; b < bank[0].length; b++) {
				System.out.println("Bank[" + a + "][" + b + "] is " + bank[a][b]);
			}
		}
	}
}
