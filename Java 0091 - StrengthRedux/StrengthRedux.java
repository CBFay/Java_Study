/**
 * Testing efficiency differences between arithmetic and bitwise operators
 * The difference appears to be very slight to negligable
 * Created 10.31.2017 by CB Fay
 */

class StrengthRedux {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int result = 1;
		
		for(int i = 0; i < 1000000; i++) {
			System.out.println(i * 8);
			// System.out.println(i << 3);
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Took " + (endTime-startTime) + " milliseconds");
	}
}