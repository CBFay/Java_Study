/*
	-	From pg 189 of "Java: A Beginner's Guide - Sixth Edition" 
	-	Passing an object as a paremter to a method
	-	Created 10.03.2017 by CB Fay
*/

// Objects can be passed to methods
class Block {
	int a, b, c;
	int volume;
	
	// Constructor
	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a * b * c;
	}
	
	//Return true if ob defines same block
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c))
			return true;
		else return false;
	}
}

class PassOb {
	public static void main(String[] args) {
		Block ob1 = new Block(1,2,3);
		Block ob2 = new Block(2,4,6);
		Block ob3 = new Block(2,4,6);
		
		System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob2 same dimensions as ob3: " + ob2.sameBlock(ob3));
		System.out.println("ob3 same dimensions as ob1: " + ob3.sameBlock(ob1));
	}
}