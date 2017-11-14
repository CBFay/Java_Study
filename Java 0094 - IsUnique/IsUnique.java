/**
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 * From pg 90 Gayle Laakman McDowell's "Cracking the Coding Interview"
 * Created 11.13.2017 by CB Fay
 */

class IsUnique {
	
	public static void main(String[] args) {
		String testcase = "dogs";
		
		System.out.println(charsAreUnique(testcase));
		System.out.println(charsAreUnique2(testcase));
	}
	
	// My first attempt at the problem. 
	static boolean charsAreUnique(String str) {
		
		// When working with characters, it's usually important to ask whether they are ASCII or Unicode.
		if (str.length() > 256) return false;
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	// a solution proposed by CCI that uses a bit vector
	static boolean charsAreUnique2(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}
}