package Assignment2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {

	double calculateBonus() throws InvalidAgeException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Joining Date :");
		String dateString = scanner.nextLine();
		try {
			LocalDate joiningDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			LocalDate lcDate = LocalDate.now();
			if(joiningDate.isAfter(lcDate)) {
				throw new InvalidAgeException("Age should not be in the future");
			}
			long experience = ChronoUnit.YEARS.between(joiningDate, lcDate);

			if (experience < 1)
				return 1000;
			else if (experience < 2)
				return 5000;
			else if (experience > 2) {
				return 10000;
			}
			return 0;
		}
		catch (DateTimeParseException e) {
			throw new InvalidAgeException("Invalid Format");
		}
		
	}

	public static void main(String[] args) {
		EmployeeBonus e1 = new EmployeeBonus();
		try {
			System.out.println("Employee Bonus  : " + e1.calculateBonus());
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg) {
		super(msg);
	}
}
