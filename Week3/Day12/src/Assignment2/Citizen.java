package Assignment2;

import javax.management.loading.PrivateClassLoader;

public class Citizen {

	private String name;
	private String aadharNumber;
	private String mobileNumber;
	
	

	public Citizen(String name, String aadharNumber, String mobileNumber) {
		super();
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}



	public String getAadharNumber() {
		return aadharNumber;
	}

	

	public String getMobileNumber() {
		return mobileNumber;
	}



}
