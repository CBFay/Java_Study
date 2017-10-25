/*
  - An improved version of Average.java that is more interactive
  - Takes a user defined number of ints from the user and averages them
  - Created 09.15.2017 by CB Fay
*/

import java.util.Scanner;

class Average2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); // declare Scanner "input"
      int total = 0, grade, average, counter, samplesize; // declare basic variables

      System.out.print("What is the sample size: "); // prompt the user for the number of ints to be collected
      samplesize = input.nextInt(); // collect input from the user

      for(counter = 0; counter < samplesize; counter++) { // creates a loop that stores 10 ints with the Scanner object and increments variables
        System.out.print((counter+1) + ": "); // prompt the user for an int
        grade = input.nextInt(); // use Scanner object to get individual records
        total += grade; // add the newly collected "grade" variable to the total
      }
      average = total/samplesize; // divide the total by the number of samples
      System.out.println("Your average is " + average);
  }
}
