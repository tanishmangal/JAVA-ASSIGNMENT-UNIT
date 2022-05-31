package Assignment2;

abstract public class Student {
	String name;
	String address;

	abstract float getPercentage();

	public Student(String name, String address) {

		this.name = name;
		this.address = address;
	}
}

class ScienceStudent extends Student {

	public ScienceStudent(String name, String address, int physics, int chemestry, int maths) {
		super(name, address);
		this.phisicsMarks = physics;
		this.chemistryMarks = chemestry;
		this.mathsMarks = maths;

	}

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;

	@Override
	float getPercentage() {
		return (this.phisicsMarks+this.chemistryMarks+this.mathsMarks)/3;
	}

}

class HistoryStudent extends Student {

	public HistoryStudent(String name, String address,int history,int civics) {
		super(name, address);
		this.historyMarks=history;
		this.civicsMarks=civics;
	}

	int historyMarks;
	int civicsMarks;

	@Override
	float getPercentage() {
		return (this.civicsMarks+this.historyMarks)/2;
	}

}
