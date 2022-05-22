package employeeDetails;
import java.util.Scanner;
 public class Employee {
   private int employeeId;
   private String employeeName;
   private double salary;
   private double netSalary;
     
   public Employee(){
	   
   }
      public void calculateNetSalary(int pfpercentage) {
	  this.netSalary=this.salary-(this.salary*pfpercentage)/100;
	  System.out.println("Employee ID ="+employeeId);
	  System.out.println("Employee Name ="+employeeName);
	  System.out.println("Employee Salary ="+salary);
	  System.out.println("Employee Net Salary ="+netSalary);
	 
      }
      public void setEmployeeId(int employeeId) {
    		this.employeeId = employeeId;
      }

      public void setEmployeeName(String employeeName) {
    		this.employeeName = employeeName;
      }

      public void setSalary(double salary) {
    		this.salary = salary;
      }
      public static int getPFPercentage() {
    	  Scanner s = new Scanner(System.in);
    	  System.out.println("Enter Employee PF percent:=");
          return s.nextInt();
      }

	public static Employee getEmployeeDetails() {
		   Scanner sc = new Scanner(System.in); 
		   System.out.println("Enter Employee ID:=");
		   Employee em=new Employee();
		   em.setEmployeeId(sc.nextInt());
		    
		   sc.nextLine();
		   System.out.println("Enter Employee Name:=");
		   em.setEmployeeName(sc.nextLine());
		   System.out.println("Enter Employee Salary:=");
		   em.setSalary(sc.nextDouble());
		   return em;
   }

}
 
