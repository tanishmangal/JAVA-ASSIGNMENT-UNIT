package Assignment2;

public class DayScholar extends Student {
    double transportFee;

	public DayScholar(int studld, String stuName, double examFee ,double transportFee) {
		super(studld, stuName, examFee);
		this.transportFee=transportFee;
		}
	@Override
	double payFee(double pay) {
		double remFee=this.transportFee+this.examFee-pay;
		return remFee ;
	}
}
