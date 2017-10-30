/*
    - Use multiple classes to get operate on a Queue
    - Created 09.22.2017 by CB Fay
*/

import java.util.Scanner;

class Queue {
	static char[] q; // the array that holds the queue
	static int putloc, getloc; // the put and get indeces

	// a constructor that gives q memory based on the value of an int "size" that is taken as a parameter
	static void defQ(int size) {
		q = new char[size]; // allocate memory for q
		putloc = getloc = 0; // initialize the value of the indeces to 0
	}

	 //a method that puts a character into the queue
	static void put(char ch) {
		if(putloc==q.length) {
			System.out.println();
			System.out.println("*Storage Failed:FULL*\n");
			return;
		}

		q[putloc++] = ch;
		System.out.println("Stored!\n");
	}

	// a method that returns a character from the queue
	static char get() {
		if(getloc==q.length) {
			System.out.println("*Retrieval Failed:EMPTY*");
			return (char) 0; // what is 0 cast to char?
		}

		return q[getloc++]; // after the return, getloc is incremented
	}
}

class QClient {
    static Scanner input = new Scanner(System.in);
    static int cmd;
    static char item;
    static int s;

    public static void main(String[] args) {

		System.out.print("What is the size of the Queue? ");
		//initialize members of p71_Queue
		p71_Queue.defQ(input.nextInt());
		System.out.println("Queue initialized!");
		System.out.println("The length of Queue is " + p71_Queue.q.length);
		System.out.println();

		while(true) {
			//prompt the user for a command
			System.out.print("Select (1)put or (2)get: ");
			cmd = input.nextInt();
			// nextInt didn't consume the \n, so this is necessary to consume it
			//input.nextLine();

			// if(cmd =="put") *** This won't work, because == checks for reference equality
			// *** this is the way to check for value equality with Strings
			switch(cmd) {
				case 1:
					System.out.print("store a char: ");
					item = input.next().charAt(0);
					p71_Queue.put(item);
					System.out.println();
						break;
				case 2:
					System.out.println("The oldest char in the Queue is \""+p71_Queue.get()+"\".");
					System.out.println();
						break;
				default:
					System.out.println ("error: command not recognized, try again.");
					System.out.println(cmd);
					System.out.println();
						break;
			}
		}
	}
}
