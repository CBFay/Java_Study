/*
	-	Prompts the user for input and stores even integers in an array.
	- 	Lets make this more efficient.
	- 	Can that class also return the int it was given, so that I don't have to use temp?
	-	Created 09.19.2017 by CB Fay
*/

import java.util.Scanner; // import the "Scanner" class that lets us get input from the user

public class CollectEvens { // declare a class called CollectEvens
 public static void main(String[] args) { // declare a method "main" that receives an array of Strings as parameters, and returns void
  Scanner input = new Scanner(System.in); // declare a new Scanner variable called "input" and allocate memory for the object
  int[] bank = new int[5]; // declare a new array of type int called "bank", and allocate it 5 units of memory, each of size int
  int bankcount = 0, banklimit = 5; // declare and initialize two variables of type int, that will be used as loop counters
  ChkNum e = new ChkNum(); // declare a new variable based on the ChkNum class, and allocate memory for the object
  int temp; // declare a variable of type int that will store values received from the user by "input"

  while(bankcount < banklimit) { // take input from the user until the array "bank" is full
   System.out.print("Type an integer: "); // prompt the user for input
   temp = input.nextInt(); // get an int from the user and store it it "temp"
   if(e.isEven(temp)) { // use the ChkNum object "e" to check the even-ness of the int stored in "temp"
   bank[bankcount] = temp; // store the value of "temp" in the next index in the array "bank"
   System.out.println("Stored!"); // tell the user that their value was stored in the array "bank
   bankcount++; // increment the index of the array
   }
  }
  System.out.println("Done Collecting.\n"); // tell the user that the input phase is over
  System.out.println("The first 5 even ints were..."); // tell the user that they're about to be given output
  for(bankcount = 0; bankcount < banklimit; bankcount++) { // iterate over the indexes in the array
   System.out.print(bank[bankcount] + ", "); // print the value in the current index
  }
 }
}
class ChkNum { // declare class ChkNum
  // return true if x is even
  boolean isEven(int x) { // declare a method called "isEven" that receives an int "x" as a parameter and returns a boolean
  if((x%2)==0) return true; // return true if "x" divides evenly by 2
    else return false; //
  }
}
