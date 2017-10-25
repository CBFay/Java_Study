/*	
	-	From pg 111 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Creates an object of the Vehicle class
	-	Created 09.18.2017 by CB Fay
*/

class AddMthd {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		
		int range1, range2;
		
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.print("Minivan can carry " + minivan.passengers + ". ");
		minivan.range();
		
		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
		sportscar.range();
	}
}