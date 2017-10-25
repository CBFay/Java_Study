/*
  - From "thenewboston"'s youtube series on Java
  - Takes 10 ints from the user and averages them
  - Created 09.15.2017 by CB Fay
*/

import java.util.Scanner;

class Average {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in); // declare Scanner "input"
      int total = 0, grade, average, counter; // declare basic variables

      for(counter = 0; counter < 10; counter++) { // creates a loop that stores 10 ints with the Scanner object and increments variables
        grade = input.nextInt(); // use Scanner object to get individual records
        total += grade; // add the newly collected "grade" variable to the total
      }
      average = total/10; // divide the total by the number of samples
      System.out.println("Your average is " + average);
  }
}
