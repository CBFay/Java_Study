/* 	
 * From pg. 338 of "Java: A Beginner's Guide - Sixth Edition"
 * Created 11.03.2017 by CB Fay
 */

/* Display a text file..

	To use this program, specify the name
	of the file that you want to see.
	For example, to see a file calle TEST.TXT.
	use the following command line.
	
	java ShowFile TEST.TEXT
*/

import java.io.*;

class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin; // variable declared, but no object has been created
		
		// First make sure that a file has been specified.
		if (args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		
		try {
			// object creation
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found");
			return;
		}
		
		/**
		read() returns an integer representation
		of the next availbable byte of input. -1 is
		returned when the end of the stream is encountered.
		*/
		 
		try {
			//read bytes until EOF is encountered
			do {
				i = fin.read(); // 
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("Error reading file.");
		}
		
		System.out.println();
		
		/**
		 close() closes the input source. Further read
		 attempts will generate an IOException
		*/
		
		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("Error closing file.");
		}
	} // <- main class
	
} // <- ShowFile class