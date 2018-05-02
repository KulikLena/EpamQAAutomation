package epamQAAutomation;

public class MyException extends Exception {
	static String message;

	public MyException(String someText) {
		someText = message;
	}

}
