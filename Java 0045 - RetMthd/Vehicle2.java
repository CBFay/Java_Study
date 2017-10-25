/*	
	-	From pg 114 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Called by RetMthd
	-	Improved version of Vehicle because it returns a value rather than printing
	-	Created 09.18.2017 by CB Fay
*/

class Vehicle2 {
	int passengers, fuelcap, mpg;
	int range() {
		return fuelcap * mpg;
	}
}