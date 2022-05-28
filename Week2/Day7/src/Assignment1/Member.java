package Assignment1;

public class Member {

	int age;
	String phoneNumber;
	String address;
	double salary;

	public Member(int age, String phoneNumber, String address, double salary) {
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	void printSalary() {
        System.out.println(this.salary);
	}
}
