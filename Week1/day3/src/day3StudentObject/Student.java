package day3StudentObject;

public class Student {
   int roll;
   String name;
   int marks;
   void displayStudentDetails()
   {
	   System.out.println("Roll:"+roll);
	   System.out.println("Name:"+name);
	   System.out.println("Marks:"+marks);
   }
	public static void main(String[] args) {
		Student details1=new Student();
		details1.roll=25;
		details1.name="Tanish";
		details1.marks=66;
		details1.displayStudentDetails();
		
		
		Student details2=new Student();
		details2.roll=15;
		details2.name="Manish";
		details2.marks=86;
		details2.displayStudentDetails();

	}

}
