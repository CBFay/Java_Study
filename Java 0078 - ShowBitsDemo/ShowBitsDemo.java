/*
	-	From pg. 174 of "Java: A Beginner's Guide - Sixth Edition"
	-	Display the binary bit pattern of any integer value
	-	Created 09.25.2017 by CB Fay
*/

class ShowBits {
	int numbits;

	ShowBits(int n) {
		numbits = n;
	}

	void show(long val) {
		long mask = 1;

		//left shift a 1 into the proper position
		mask <<= numbits-1;

		int spacer = 0;
		for(; mask != 0;mask >>>= 1) {
			if((val & mask) != 0) System.out.print("1");
			else System.out.print("0");
			spacer++;
			if((spacer % 8) == 0) {
				System.out.print(" ");
				spacer = 0;
			}
		}
		System.out.println();
	}
}

//Demonstrate ShowBits
class ShowBitsDemo {
	public static void main(String[] args) {
		p90_ShowBits b = new p90_ShowBits(8);
		p90_ShowBits i = new p90_ShowBits(32);
		p90_ShowBits li = new p90_ShowBits(64);

		System.out.print("Show 123 in binary: ");
		b.show(123);

		System.out.print("Show 5647 in binary: ");
		i.show(5647);

		System.out.print("Show 987654 in binary: ");
		li.show(987654);

		//you can also show low-order bits of any integer
		System.out.println("\nLow order bits of 87987 in binary: ");
		b.show(87987);
	}
}
