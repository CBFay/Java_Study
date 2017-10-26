/*
  - From episode 26 of Compsci's beginner Java series on Youtube
  - Demonstrates Access Modifiers
  - Created 09.19.2017 by CB Fay
*/

public class AccessMods {
  public static String name = "compscistudio"; // this can be access from anywhere in our program
  private static String pname = "animal"; // this variable CANNOT be accessed outside the AccessMods class
  // "protected" is another type of access modifier, but it is not discussed here.
}
