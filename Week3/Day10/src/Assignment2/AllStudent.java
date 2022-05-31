package Assignment2;

import java.security.PKCS12Attribute;
import java.util.Scanner;

public class AllStudent {

	public AllStudent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student Address: ");
;		String add=sc.nextLine();
        System.out.println("Choose Science Student 1  and History Student 2: ");
        int n=sc.nextInt();
        if(n==1) {
        	 System.out.println("Enter Physics Marks Out of 100 : ");
        	 int physics=sc.nextInt();
        	 System.out.println("Enter Chemestry Marks Out of 100 : ");
        	 int chemestry=sc.nextInt();
        	 System.out.println("Enter Maths Marks Out of 100 : ");
        	 int maths=sc.nextInt();
        	 Student s1=new ScienceStudent(name,add,physics,chemestry,maths);
        	 System.out.println("Student Scored :");
        	 System.out.println(s1.getPercentage()+"%"); 
        }else if(n==2){
        	System.out.println("Enter History Marks Out of 100 : ");
       	 int history=sc.nextInt();
       	 System.out.println("Enter Civics  Marks Out of 100 : ");
       	 int civics=sc.nextInt();
       	 Student s1=new HistoryStudent(name,add,history,civics);
       	 System.out.println("Student Scored :");
       	 System.out.println(s1.getPercentage()+"%"); 
		}
     
        System.out.println("---------------------------------------");
     
	}

}
