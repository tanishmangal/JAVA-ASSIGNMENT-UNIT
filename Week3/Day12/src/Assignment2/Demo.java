package Assignment2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		if (!Pattern.matches("[a-zA-z]{3,14}", name)) {
			return false;
		}
		if (!Pattern.matches("\\d{12}", aadharCard)) {
			return false;
		} 
		if(!Pattern.matches("[6-9]{1}\\d{9}", mobileNum)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = scanner.nextLine();
		;
		System.out.println("Enter Your Mobile No :");
		String mobileNo = scanner.nextLine();
		System.out.println("Enter Your Aadhar Card :");
		String aadharNo = scanner.nextLine();
		Demo d1 = new Demo();
		if (d1.validate(name, mobileNo, aadharNo)) {
         Citizen citizen=new Citizen(name, aadharNo, mobileNo);
         System.out.println("Name: "+citizen.getName());
         System.out.println("Aadhar No: "+citizen.getAadharNumber());
         System.out.println("Mobile No: "+citizen.getMobileNumber());
		}else {
			System.out.println("Please Enter Rigth Details");
		}
	}

}
