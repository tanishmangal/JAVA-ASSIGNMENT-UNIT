package Assignment2;

public class Student {
	int studld;
	String stuName;
	double examFee;

	public Student(int studld,String stuName,double examFee) {
		this.studld=studld;
		this.stuName=stuName;
		this.examFee=examFee;
	}
	
	void displayDetails() {
		System.out.println("Id :"+this.studld);
		System.out.println("Name :"+this.stuName);
	}
	double payFee(double pay) {
		double remFee=this.examFee-pay;
		return remFee ;
	}

}
