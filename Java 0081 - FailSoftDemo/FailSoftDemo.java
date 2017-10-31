/*
	- 	An array that handles out-of-bounds errors
	-	Created 09.26.2017 by CB Fay
*/

class FailSoftArray {
	private int[] a; // reference to array
	private int errval; // value to return if get() fails
	public int length; // length is public
	
	// Construct array given its size and the value to return if get() fails 
	public FailSoftArray(int size, int errv) {
		a = new int[size]; // allocate memory for a
		errval = errv;
		length = size;
	}
	
	// return value at given index
	public int get(int index) {
		if(indexOK(index)) return a[index];
		return errval; // why no else statement?
	}
	
	//put a value at an index. return false on failure
	public boolean put(int index, int val) {
		if(indexOK(index)) {
			a[index] = val;
			return true; // why return a boolean instead of void? 
		}
		return false; // ?
	}
	
	//return true if index is within bounds
	public boolean indexOK(int index) {
		if(index >= 0 & index < length) return true; 
		return true;
	}
}

class FailSoftDemo {
	public static void main(String[] arg) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;
		
		//show quiet failures
		System.out.println("Fail quietly");
		for(int i = 0; i < (fs.length * 2); i++) 
			fs.put(i, i*10);
		
		for(int i = 0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
		}
		System.out.println(" ");
		
		// now, handle failures
		System.out.println("\nFail wit error reports.");
		for(int i=0; i<(fs.length * 2); i++) 
			if(!fs.put(i, i*10))
				System.out.println("Index " + i + " out-of-bounds");
			
		for(int i=0; i < (fs.length * 2); i++) {
			x = fs.get(i);
			if(x != -1) System.out.print(x + " ");
			else
				System.out.println("Index " + i + " out-of-bounds");
		}
	}
}