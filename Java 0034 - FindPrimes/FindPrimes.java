/**
 * created 09.12.2017 by CB Fay
 * updated 10.24.2017
 */

// Iterate over integers up to 100
	// Assume they are prime, and try to prove that they are composite
	// Iterate over all possible factors, and break if an actual factor is found
		//If the for loop completes and no factors are found, print that it is prime, and increment pcount

		
// (10.24.2017) It would be much more efficient to only test factors less than the square root of num
public class FindPrimes {
	public static void main(String[] args) {
		
		//declare basic variables
		int num, fac, pcount = 0; // number, factor, primecount
		boolean comp; // composite

		//iterate over numbers, starting with 2 to check if they are prime.
		for(num = 2; num <= 500; num++) {
			comp = false; // doesn't work if I try to initialize comp in the for statement!!!
			// System.out.println("number being tested is " + num);
			// System.out.println("comp is " + comp);
			for(fac = 2; fac < num; fac++) {
				if(num%fac == 0) {
					comp = true;
					// System.out.println(num + " is composite.\n");
					break;
				}
			}
			// System.out.println("comp is " + comp);
			if(!comp) {
				pcount++;
				System.out.println("FOUND: Prime# " + pcount + " is " + num);
				System.out.println();
			}
		}
	}
}

		