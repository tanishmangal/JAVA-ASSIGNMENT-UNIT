package Assignment2;

public class Main {

	
	public static void main(String[] args) {
	
		DayScholar st1=new DayScholar(1, "Tanish", 1500,1500);
		Hosteller st2=new Hosteller(2,"Aniket",1500, 3000);
		
		System.out.println(st1.payFee(500));
		
		System.out.println(st2.payFee(700));
	
	}

}
