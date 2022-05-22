package day4;



public class Studentt{
	int roll;
	String name;
	String address;
	String collegeName;
	Studentt(int roll,String name,String add){
		this.roll=roll;
		this.name=name;
		this.address=add;
		this.collegeName="NIT";
		this.details();
	}
	Studentt(int roll,String name,String add,String clgadd){
		this.roll=roll;
		this.name=name;
		this.address=add;
		this.collegeName=clgadd;
		this.details();
	}
	void details(){
		System.out.println("Roll No:"+roll);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Colleage Address:"+collegeName);
	}
	public static void getStudent(boolean isFromNIT){
		if(isFromNIT) {
			new Studentt(10,"tanish","Nalkheda");
		}else {
			new Studentt(15,"Manish","Indore","VIT");
		}
	}
		public static void main(String[] args) {
		getStudent(true);
		getStudent(false);
			


	}

}
