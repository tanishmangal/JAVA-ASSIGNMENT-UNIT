package Assignment1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Birth {

	void enterBirth() throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Date Of Birth Example: 09/04/2000 : ");
		String birth = scanner.nextLine();
		
		LocalDate dob= LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate lDate=LocalDate.now();
		Period diff = Period.between( dob,lDate);
		if(diff.getMonths()<0 || diff.getYears()<0 || diff.getDays()<0) {
			System.out.println("Date should not be in Future");
		}else {
			System.out.println("You Are "+diff.getDays()+"Days,"+diff.getMonths()+"Month,"+diff.getYears()+"Year Old");
		}
		
	}

	public static void main(String[] args) {
		Birth birth=new Birth();
		try {
			birth.enterBirth();
		} catch (Exception e) {
			System.out.println("Invalid Format");
		}
		

	}

}
