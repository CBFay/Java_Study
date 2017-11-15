/** 	
 * From pg. 345 of "Java: A Beginner's Guide - Sixth Edition"
 * Use try-with-resources to automatically release a file
 * Created 11.14.2017 by CB Fay
 */

import java.io.*;

class ShowFile2 {
	public static void main(String[] args) {
		int i;
		
	// First, make sure that a file name has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile filename");
			return;
		}
		
		// The following code uses ry-with-resources to open a file
		// and then automatically close it when the try block is left.
		try( FileInputStream fin = new FileInputStream(args[0])) {
			
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != 1);
				
		
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
