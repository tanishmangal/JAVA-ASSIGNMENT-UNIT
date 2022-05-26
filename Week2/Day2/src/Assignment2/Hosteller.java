package Assignment2;

public class Hosteller extends Student {
    double hostelFee;
	
	public Hosteller(int studld, String stuName, double examFee,int hostelFee) {
		super(studld, stuName, examFee);
		this.hostelFee=hostelFee;
	}
	@Override
	double payFee(double pay) {
		double remFee=this.hostelFee+this.examFee-pay;
		return remFee ;
	}

}
