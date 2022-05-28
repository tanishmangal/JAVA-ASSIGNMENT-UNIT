package Assignment1;
import java.util.Scanner;

class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;

	public Student() {
		
	}
	@Override
	public String toString() {
		return "Name: "+this.name+
				"   Roll No: "+this.roll+
				"   Marks: "+this.marks+
				"   Grade: "+this.grade
				;
	}
	public void display() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Full Name");
		this.name=sc.nextLine();
		
		System.out.println("Enter Student Roll No:");
	    this.roll=sc.nextInt();
		
		System.out.println("Enter StudentMarks:");
	    this.marks=sc.nextInt();
		
	    this. grade=calculateGrade(marks);
		
		System.out.println("------------------------------------");
		
	}
	public  char calculateGrade(int marks) {
		if(marks>=500)
			return 'A';
		else if(marks>=400)
			return 'B';
		else 
			return 'C';
	}
}
class Demo{
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.display();
		s2.display();
		System.out.println(s1);
		System.out.println(s2);
		
	}
}