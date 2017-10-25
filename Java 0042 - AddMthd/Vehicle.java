/*	
	-	From pg 111 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Called by AddMthd.java
	-	Created 09.18.2017 by CB Fay
*/

class Vehicle {
	int passengers, fuelcap, mpg;
	void range() {
		System.out.println("Range is " + fuelcap * mpg);
	}
}