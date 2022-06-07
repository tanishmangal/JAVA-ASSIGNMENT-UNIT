package Assignment1;

public class Amount {

	String accountNumber;
	double balance;

	public Amount(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	void withdraw(double amount) throws InsufficientFundException {

		if (amount > balance) {
			throw new InsufficientFundException("Insufficient Balance");
		} else {
			balance = balance - amount;
		}

	}

}

class InsufficientFundException extends Exception {

	public InsufficientFundException(String string) {
		super(string);
	}

}
