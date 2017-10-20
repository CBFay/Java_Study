/*
 * counts in decimal, and converts to binary.
 * created 08.31.2017 by CB Fay
 */

public class binarycounter
{
    public static void main(String[] args)
	{
        int v; // v represents "value"
        int r; // r represents "remainder"
		
        int ones, twos, fours, eights; // declares one variable for each power of 2, up to 2^3.
       
		
		for(v = 0; v <= 15; v++)
		{
		r = v; // initialize the remainder

			// Check for eights
			if(v < 8) {eights = 0;}
			else {eights = 1;	r = r -8;}
				System.out.print(eights);

			// Check for fours
			if(r < 4) {fours = 0;}
			else {fours = 1;	r = r -4;}
				System.out.print(fours);
	
			// Check for twos
			if(r < 2) {twos = 0;}
			else {twos = 1;		r = r -2;}
					System.out.print(twos);
		
			// Check for ones
			if(r < 1) {ones = 0;}
			else {ones = 1;		r = r -1;}
				System.out.println(ones);
        }
    }
}

/*
 * Post program thoughts:
 * There are probably more efficient ways to accomplish this with for loops and a flexible base.
 * I'd like to incorporate the standard class methods for power calculation in the future.
 * Aesthetically, I don't like using open curly brackets at the end of lines. Most code I've seen uses a line break anyway, so why not fill the empty line with a curly brace? It's easier to find.	
 * I learned that "CTRL + Q" comments out lines!
 */