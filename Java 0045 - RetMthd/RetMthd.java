/*	
	-	From pg 114 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Calls a method and variables from Vehicle2
	-	Improved version of AddMthd because it receives a return from range()
	-	Created 09.18.2017 by CB Fay
*/

class RetMthd {
	public static void main(String[] args) {
		Vehicle2 minivan = new Vehicle2();
		Vehicle2 sportscar = new Vehicle2();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		//get the ranges
		range1 = minivan.range();
		range2 = sportscar.range();
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1 + " miles.");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " miles.");
	}
}