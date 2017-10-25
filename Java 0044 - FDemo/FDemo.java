/*	
	-	From pg 130 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Demonstrates finalize()
	-	I have some reading to do to fully understand this program
	-	Created 09.18.2017 by CB Fay
*/

class FDemo {
	int x;
	
	FDemo (int i) {
		x = i;
	}
	 // called when object is recycled
	 protected void finalize () {
		 system.out.println("Finalizing " + x);
	 }
	 
	 //generates an object that is immediately destroyed
	 void generator(int i) {
		 FDemo o - new FDemo(i);
	 }
}