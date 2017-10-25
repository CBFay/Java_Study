/*
  - From "thenewboston"'s youtube series on Java
  - Eliminates the need for a Scanner by giving the object "cd" an argument, that will be used by a constructor method
  - Constructor methods can be called in the declaration line of the object (line 12)
  - Combine multiple classes to accomplish goals
  - Created 09.15.2017 by CB Fay
*/

public class GirlConstruct {
  public static void main(String[] args) {

    ConstructorDemo cd = new ConstructorDemo("Ruthie"); // declare new object from class ConstructorDemo named "cd"

    cd.getName(); // call method "getName" from object "cd"
    cd.saying(); // call method "getName" from object "cd"
  }
}
