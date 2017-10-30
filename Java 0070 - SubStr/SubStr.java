/*
	-	From pg. 163 of "Java: A Beginner's Guide - Sixth Edition"
	- 	Use a the substring member to define a new String from within an existing one
	-	Created 09.24.2017 by CB Fay
*/

class SubStr {
	public static void main(String[] args) {
		String orgstr = "Java makes the Web move.";

		//construct a substring
		String substr = orgstr.substring(5, 18);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);
	}
}
