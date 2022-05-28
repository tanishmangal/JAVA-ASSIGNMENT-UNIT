package Assignment4;
import java.util.Scanner;

class Bank {
	String branchName;
	String ifscCode;
	void displayDetails() {
		System.out.println("Bank Name:=" + this.branchName);
		System.out.println("IfSC Code:=" + this.ifscCode);
	}
}

class AxixBank extends Bank {
	double rateOfIntrest;
	@Override
	void displayDetails() {
		System.out.println("Bank Name:=" + this.branchName);
		System.out.println("IfSC Code:=" + this.ifscCode);
		System.out.println("Rate of Intrest:=" + this.rateOfIntrest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank {
	double rateOfIntrest;

	@Override
	void displayDetails() {
		System.out.println("Bank Name:=" + this.branchName);
		System.out.println("IfSC Code:=" + this.ifscCode);
		System.out.println("Rate Of Intrest:=" + this.rateOfIntrest + "%");
	}
}

class Demo {
	public static Bank getBank(String bank) {
		Scanner sc = new Scanner(System.in);
		if (bank.equals("axix")) {
			AxixBank accBank = new AxixBank();
			System.out.println("Enter Your Branch Name: ");
			accBank.branchName = sc.next();
			System.out.println("Enter Your IFSC Code : ");
			accBank.ifscCode = sc.next();
			System.out.println("Enter Rate Of Intrest : ");
			accBank.rateOfIntrest = sc.nextDouble();
			return accBank;
		} else if (bank.equals("icici")) {
			ICICIBank accBank = new ICICIBank();
			System.out.println("Enter Your Branch Name: ");
			accBank.branchName = sc.next();
			System.out.println("Enter Your IFSC Code : ");
			accBank.ifscCode = sc.next();
			System.out.println("Enter Rate Of Intrest : ");
			accBank.rateOfIntrest = sc.nextDouble();
			return accBank;
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bank Name");
		String bank = sc.next();
		Bank bankAccount = getBank(bank);
		if (bankAccount != null) {
			System.out.println("-----------------------");
			bankAccount.displayDetails();
			if(bankAccount instanceof AxixBank)
			{
				((AxixBank) bankAccount).getCreditCard();
			}
			System.out.println("-----------------------");
			
		} else {
			System.out.println("You Enter Invalid Bank Name");
		}
		
		sc.close();

	}

}
