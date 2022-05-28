package Assignment1;

public class Employee extends Member {

	String specialisation;
	String department;
	public Employee(int age,String address,String phoneNumber,double salary,String specialisation,String department) {
		super(age,address,phoneNumber, salary);
		this.specialisation=specialisation;
		this.department=department;
	}
	
}
