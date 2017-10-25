/*
  - From "thenewboston"'s youtube series on Java
  - Calls methods from Girl.class
  - Combine multiple classes to accomplish goals
  - Created 09.15.2017 by CB Fay
*/

import java.util.Scanner;

class GirlName {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // declare a Scanner named input
    Girl girlObject = new Girl(); // declare an object named girlObject from class Girl

    System.out.println("Enter the name of the girl here: "); // prompt the user for input
    String temp = input.nextLine(); // declare a String called temp and give it a value with the Scanner "input"

    girlObject.setName(temp); // calls the method "setName" from "girlObject" and give it the string "temp"
    girlObject.saying(); // calls the method "saying" from "girlObject"
  }
}
