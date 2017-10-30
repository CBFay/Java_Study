/*
	- 	Store the reversal of a String in a second String
	-	Created 09.24.2017 by CB Fay
*/

// 1: initialize the first String and an array that will receive it's substrings
// 2: use String.valueOf and charAt in conjunction with a for loop to populate the array in reverse
// 3: use a StringBuilder object to receive all the Strings in the array
// 4: construct a new string from the StringBuilder's toString method
// 5: print the reversed String

class StringReverse {
	public static void main(String[] args) {

// 1: Initialize

		String s = new String("Hello! This is a String");
		//this array will store substrings for each letter in "s"
		String[] temp = new String[s.length()];

// 2: Populate array

		//fill temp[] with strings, each one char long
		for(int i = s.length(); i > 0; i--) {
			//convert  "s.charAt(i-1)" to a String, and store it in "temp"
			//the -1 accounts for the 0'th index of "temp"
			temp[s.length() - i] = String.valueOf(s.charAt(i-1));
		}

// 3: StringBuilder .append();

		//declare a new object "builder" of type StringBuilder
		StringBuilder builder = new StringBuilder();
		//for every value in temp...
		for(String n : temp) {
			//add the String held in the iteration variable "n" to the builder object
			builder.append(n);
		}

// 4: Contruct with .toString();

		//declare a new variable "reversed" of type String
		//give it the return value of the toString object "builder"
		String reversed = builder.toString();

 // 5: Print
		//print the outcome of String "reversed"
		System.out.println(reversed);

	}
}
