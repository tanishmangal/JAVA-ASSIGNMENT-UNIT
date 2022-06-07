package Assignment1;

import javax.security.auth.login.AccountException;

public class AmountDemo {

	public static void main(String[] args) {

		Amount account = new Amount("12345678910");
		account.deposit(10000);
		try {
			account.withdraw(90000);
			System.out.println("Remaining Balance is :"+account.balance);
		} catch (InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
		 
	}

}
