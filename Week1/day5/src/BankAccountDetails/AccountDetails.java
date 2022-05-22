package BankAccountDetails;
import java.util.Scanner;

public class AccountDetails {

	public AccountDetails(){
		
	}
	public Account getAccountDetails() {
		Account userDet=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account ID:");
	    userDet.setAccountId(sc.nextInt());
	    sc.nextLine();
		System.out.println("Enter Account Type:");
		userDet.setAccountType(sc.nextLine());
		while(true){
		System.out.println("Enter Account Balance");
		userDet.setBalance(sc.nextInt());
		if(userDet.getBalance()>0)
			break;
		else
			System.out.println("Balance should be positive");
		}
		
		return userDet;
		
	}
	public int getWithdrawAmount() {
		Scanner sc=new Scanner(System.in);
		int withdraw=0;
		while(true) {
		System.out.println("Enter Withdraw Ammount:");
	    withdraw=sc.nextInt();
		if(withdraw>0) {
			break;
		}
		else {
			System.out.println("Enter Positive Value");
	    	}
		}
		sc.close();
		return withdraw ;
	}
	public static void main(String[] args) {
	AccountDetails getDetail=new AccountDetails();
	       Account a=getDetail.getAccountDetails();
	       a.withdraw( getDetail.getWithdrawAmount() );
	       
	       

	}

}
