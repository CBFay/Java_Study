/*
	-	From pg. 149 of "Java: A Beginner's Guide - Sixth Edition"
	- 	A Queue structure that interacts with the user
	-	Created 09.21.2017 by CB Fay
*/
import java.util.Scanner;

class Queue {
  char[] q; // the array that holds the queue
  int putloc, getloc; // the put and get indeces

  // a constructor that gives q memory based on the value of an int "size" that is taken as a parameter
  // how to parameters interact with constructors??
  Queue(int size) {
    q = new char[size]; // allocate memory for q
    putloc = getloc = 0; // initialize the value of the indeces to 0
  }

  //a method that puts a character into the queue
  void put(char ch) {
    if(putloc==q.length) {
      System.out.println(" - Queue is full.");
      return;
    }

    q[putloc] = ch;
  }

  // a method that returns a character from the queue
  char get() {
    if(getloc==q.length) {
      System.out.println(" - Queue is empty.");
      return (char) 0; // what is 0 cast to char?
    }

    return q[getloc++]; // after the return, getloc is incremented
  }
}

class QClient {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.println("type \"get\", or \"put\".");
  }
}
