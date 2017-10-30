/*
	-	From pg. 155 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Use a for each style loop to iterate over a dimension in an array
	-	Created 09.21.2017 by CB Fay
*/

class ForEach {
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;

    for(int x : nums) {
        System.out.println("Value is: " + x);
        sum += x;
    }

    System.out.println("Summation: " + sum);
  }
}
