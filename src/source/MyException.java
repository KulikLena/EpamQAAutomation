package source;

public class MyException extends Exception {
	public static String message;

	public MyException(String someText) {
		someText = message;
	}

}
