package day4;


public class Student {
	String name;
	int age;
	int marks;
	int roll;
	
	
  Student(){
	  this.details();

  }
  Student(int roll,String name,int age,int marks){
	  if(age>18 &&age<60&&marks>0&&marks<500) {
	  this.roll=roll;
	  this.name=name;
	  this.age=age;
	  this.marks=marks;
	  this.details();
	  }else {
		  System.out.println("they are not valid Range");
	  }
  }
  void details(){
	  System.out.println("Name:="+name);
	  System.out.println("Roll:="+roll);
	  System.out.println("Age:="+age);
	  System.out.println("Marks:="+marks);
  }
	public static void main(String[] args) {
		
	  Student stu1=new Student();
	  	  
	  Student stu2=new Student(24,"tanish",19,450);

	  
	  
		
	}



}
