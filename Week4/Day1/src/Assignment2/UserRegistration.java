package Assignment2;

import java.util.Scanner;

public class UserRegistration {

	public UserRegistration() {
		// TODO Auto-generated constructor stub
	}

	void registerUser(String userName, String userCountry) {
		
		if((userCountry.toLowerCase()).equals("india")) {
			System.out.println("User registration done successfully");
		}else {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}

	}

	public static void main(String[] args) {
		
		UserRegistration userRegistration=new UserRegistration();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String nameString=scanner.next();
		System.out.println("Enter User Country: ");
		String countryString=scanner.next();
		try {
			userRegistration.registerUser(nameString,countryString);
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
class InvalidCountryException extends RuntimeException{
	InvalidCountryException(String msg){
		super(msg);
	}
}