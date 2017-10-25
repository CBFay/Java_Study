/*
  - From "thenewboston"'s youtube series on Java
  - Takes a String from the user, and contains multiple methods that can act on the String
  - Combine multiple classes to accomplish goals
  - Created 09.15.2017 by CB Fay
*/

public class Girl {
  private String girlName; // this is called an "Instance Variable" because it is declared outside of a method
    // declaring this instance variable is necessary because it can store a variable that is within the scope of all methods in the class

  public void setName(String name) { //  declare a method "setName" that takes a String as input, and stores it as a String called "name"
    girlName = name; // the private string gets the value that was passed into this method as a parameter
      // takes a string and stores it at girlName, which all methods in the class can access
  }
  public String getName() { // declare a method "getName" with return type "String"
      return girlName; // if the user calls getName, return girlName
  }
  public void saying() { // declare a method "saying" with return type "void"
    System.out.printf("The name of the girl is %s!\n", getName()); // if the user calls "saying", use method "getName to return a String as part of our printed line"
    // this is the common print function in C, but it can be used in Java as well
  }
}
