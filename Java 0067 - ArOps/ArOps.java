/*
	- 	carries out tasks related to arrays, such as
		filling them with a single value
		numbering them
		printing their contents
	- 	I want to come back and group the methods into
		subclasses when I learn more about them
	- 	Created 09.23.2017 by CB Fay
*/

public class ArOps {

	public static void main(String[] args) {
		ArOps ops = new ArOps();

		int[][] MyArray = new int[10][10];
		ops.fill2dInt(MyArray, 0);
		ops.matrixInt(MyArray);
	}

	public void fill1dInt(int[] a, int x) {
		for(int i=0; i<a.length; i++) {
			a[i] = x;
		}

		return;
	}
	public void fill2dInt(int[][] a, int x) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = x;
			}
		}

		return;
	}
	public void fill3dInt(int[][][] a, int x) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					a[i][j][k] = x;
				}
			}
		}

		return;
	}

	public void print1dInt(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("["+i+"] is: " + a[i]);
		}
	}
	public void print2dInt(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println("["+i+"]["+j+"] is: " + a[i][j]);
			}
		}
	}
	public void print3dInt(int[][][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.println("["+i+"]["+j+"]["+k+"] is: " + a[i][j][k]);
				}
			}
		}	
	}

	public void fill1dChar(char[] a, char x) {
		for(int i=0; i<a.length; i++) {
			a[i] = x;
		}

		return;
	}
	public void fill2dChar(char[][] a, char x) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = x;
			}
		}

		return;
	}
	public void fill3dChar(char[][][] a, char x) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				(int k=0; k<a[i][j].length; k++) {
				a[i][j][k] = x;
				}
			}
		}

		return;
	}

	public void print1dChar(char[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println("["+i+"] is: " + a[i]);
		}
	}
	public void print2dChar(char[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println("["+i+"]["+j+"] is: " + a[i][j]);
			}
		}
	}
	public void print3dChar(char[][][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.println("["+i+"]["+j+"]["+k+"] is: " + a[i][j][k]);
				}
			}
		}
	}

	public void matrixInt(int[][] a) {
		int y = 0;

		//find the biggest y size contained in any x
		for(int i = 0; i < a.length; i++) {
			if(a[i].length > y) y = a[i].length;
		}

		//print the 2D array
		System.out.println();
		for(;y > 0; y--) {
			for(int x = 0; x < a.length; x++) {
				if(a[x].length < y) System.out.print("\t");
				else System.out.printf("["+a[x][y-1]+"]" + "\t");
			}			

			System.out.println("\n\n");
		}
	}

	public void fill2dChar(char[][] a, char x) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = x;
			}
		}

		return;
	}
}
