package Assignment2;

public class Main {
//Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
//So, for example, when one tries to cast an Integer to a String, String is not an subclass of Integer, so a ClassCastException will be thrown.

	public static void main(String[] args) {
		Object i = Integer.valueOf(42);
		String s = (String) i; // ClassCastException thrown here.
	}

}
