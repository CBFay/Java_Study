/*
	-	Demonstrates manual memory allocation for multi-dimensional arrays
	-	Created 09.20.2017 by CB Fay
*/

class IregArray {
	public static void main(String[] args) {
		//you only need to specify the memory for the first dimension
		int[][][] bank = new int[5][][];

		//You can manually allocate memory to secondary dimensions in several ways
		bank[0] = new int[4][];
		bank[0][0] = new int[5];
		bank[1] = new int[6][8];
	}
}
