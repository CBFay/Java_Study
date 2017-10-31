/*
	-	From pg. 170 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Uses the bitwise XOR operator to encode and decode a message
	-	Created 09.24.2017 by CB Fay
*/

class XOREncode {
	public static void main(String[] args) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.print("Original message:");
		System.out.println(msg);

		//encode the message
		for(int i=0; i < msg.length(); i++)
			encmsg += (char) (msg.charAt(i) ^ key);

		System.out.print("Encoded message: ");
		System.out.println(encmsg);

		//decode the message
		for(int i=0; i < msg.length(); i++)
			decmsg += (char) (encmsg.charAt(i) ^ key);

		System.out.print("Decoded message: ");
		System.out.println(decmsg);

	}
}
