/* 
	ErrInfo.java
	From pg. 193 of "Java: A Beginner's Guide - Sixth Edition"
	Created 10.08.2017 by CB Fay
*/

// Return a programmer-defined object
class Err {
	String msg; // error message
	int severity; // code indicating severity of error

	// constructor
	Err(String m, int s ) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds",
	};
	int howbad[] = {3, 3, 2, 4};

	// a method that returns an object of type Err
	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length)
			return new Err(msgs[i], howbad[i]);
		else
			return new Err("Invalid Error Code", 0);
	}
}

class ErrInfo {
	public static void main(String args[]) {
		ErrorInfo err = new ErrorInfo();
		Err e;

		e = err.getErrorInfo(2);
		System.out.println(e.msg + " severity: " + e.severity);

		e = err.getErrorInfo(19);
		System.out.println(e.msg + " severity: " + e.severity);
	}
}
