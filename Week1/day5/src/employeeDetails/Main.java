package employeeDetails;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee obj=Employee.getEmployeeDetails();
		int  percentage=Employee.getPFPercentage();
		obj.calculateNetSalary(percentage);
	}

}
