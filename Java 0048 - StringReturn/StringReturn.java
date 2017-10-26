/*
  - From episode 23 of Compsci's beginner Java series on Youtube
  - Uses methods to return a String
  - Created 09.19.2017 by CB Fay
*/

public class StringReturn {
  static String name;

  public static void main(String[] args) {
    setName("CB");
    System.out.println(getName());
  }

  public static void setName(String passName) {
    name = passName;
  }

  public static String getName() {
    return name;
  }
}
