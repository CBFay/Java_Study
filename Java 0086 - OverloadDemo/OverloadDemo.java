/* 	
	p131_OverloadDemo.java
	From pg. 194 of "Java: A Beginner's Guide - Sixth Edition"
	Created 10.09.2017 by CB Fay
*/

// Demonstrate method overloading
class Overload {
	void ovlDemo() {
		System.out.println("No Parameters");
	}

	void ovlDemo(int a) {
		System.out.println("One Integer Parameter" + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("Two Integer Parameters " + a + " " + b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("Two Double Parameters " + a + " " + b);
		return a + b;
	}
}

class OverloadDemo {
	public static void main(String[] args) {
		Overload ob = new Overload();
		int resI;
		double resD;

		// call all versions of ovlDemo()
		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(2);
		System.out.println();

		resI = ob.ovlDemo(3, 4);
		System.out.println("Result of ob.ovlDemo(3, 4): " + resI);

		System.out.println();

		resD = ob.ovlDemo(4.5, 5.0);
		System.out.println("Result of ob.ovlDemo(4.5, 5.0): " + resD);
	}
}
