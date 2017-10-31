/* 
	p129_ErrMsg.java
	From pg. 192 of "Java: A Beginner's Guide - Sixth Edition"
	Created 10.08.2017 by CB Fay
*/

class ErrorMsg {
	String msgs[] = {
		"Output Error",
		"Input Error",
		"Disk Full",
		"Index Out-Of-Bounds"
	};

	// Return the error message
	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Error Code";
	}
}

class ErrMsg {
	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));
	}
}
