package Assignment1;

public class Manager extends Member{

	String specialisation;
	String department;
	public Manager(int age,String address,String phoneNumber,double salary,String specialisation,String department) {
		super(age,address,phoneNumber, salary);
		this.specialisation=specialisation;
		this.department=department;
	}

}
