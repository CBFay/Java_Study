/*
  - From "thenewboston"'s youtube series on Java
  - Uses the Tuna.class with Parameters
  - Combine multiple classes to accomplish goals
  - Created 09.15.2017 by CB Fay
*/

import java.util.Scanner; // allows us to get input from the user

public class Apples {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in); // declare a Scanner named "input"
    Tuna tunaObject = new Tuna(); // declare a new p_40_tuna object called "tunaObject"

    System.out.println("Enter your name here: "); // prompt the user for input
    String name = input.nextLine(); // store the user's input in "name"

    tunaObject.simpleMessage(name); // calls the method "simpleMessage", giving it our variable "name" as an argument
  }
}
