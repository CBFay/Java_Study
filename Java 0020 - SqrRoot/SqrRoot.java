/*
	-	From "Java: A Beginner's Guide - Sixth Edition" 
	-	Show square roots of 1 to 99 and the rounding error
	-	Created 09.08.2017 by CB Fay
*/
 class p21_SqrRoot
 {
	 public static void main(String args[])
	 {
		 double num, sroot, rerr;
		 
		 for(num = 0; num < 100; num++)
		 {
			 sroot = Math.sqrt(num);
			 System.out.println("Square root of " + num + " is " + sroot);
		
			rerr = num - (sroot * sroot);
			System.out.println("Rounding error is " + rerr);
			System.out.println();
		}
	 }
 }