/*
  - From "thenewboston"'s youtube series on Java
  - Very close to p42_girl.java, but with a constructor method that uses an argument to initialize the instance variable "girlName"
  - Combine multiple classes to accomplish goals
  - Created 09.15.2017 by CB Fay
*/

public class ConstructorDemo {
  private String girlName; // declares an instance variable, String "girlName"

  public ConstructorDemo(String name) { // declares a constructor method that can run as soon as the method is called.
      girlName  = name;
      // constructor methods must have the same name as the class!
  }
  public void setName(String name) { // declare a method "setName" that take a String and store it in the instance variable "girlName"
      girlName = name;
  }
  public String getName() { // declare a method "getName" that returns the instance variable as a String
    return girlName; // "return" is a very important command
  }
  public void saying() { // declares a method "saying" that calls the method "getName" to print output to the user
    System.out.printf("The girl's name is %s.\n", getName());
  }
}
