/* 
  - From pg. 183 of "Java: A Beginner's Guide - Sixth Edition"
  - Demonstrates access modifiers
  -	Created 09.26.2017 by CB Fay
*/

class MyClass {
	private int alpha;
	public int beta;
	int gamma;
	
	void setAlpha(int a) {
		alpha = a;
	}
	
	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		// you cannot access alpha like this:
		// ob.alpha = 10;
		
		// from outside of the class, alpha can accessed with a method
		ob.setAlpha(-99);
		System.out.println("ob.alpha is " + ob.getAlpha());
		
		ob.beta = 11;
		ob.gamma = 15;
		System.out.println("beta and gamma are: " + ob.beta + " and " + ob.gamma);
	}
}