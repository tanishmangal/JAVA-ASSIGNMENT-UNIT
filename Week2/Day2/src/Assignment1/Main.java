package Assignment1;


public class Main {

	
	public static void main(String[] args) {
	    Employee s1=new Employee(25, "Indore", "999999999",700000, "Backend","IT");
		Manager m1=new Manager(45, "Bangalore", "123456789", 1500000,"Full Stack Developer", "IT");
		s1.printSalary();
		m1.printSalary();
	}
	

}
