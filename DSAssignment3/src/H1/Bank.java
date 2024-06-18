package H1;
public class Bank {
	long account_no;
	String name;
	double balance;

	Bank(int account_no, String name, double balance) throws InvalidBalanceException {
		if (balance<0) {
			throw new InvalidBalanceException("Balance cannot be less than 0");
		}
		this.account_no=account_no;
		this.name=name;
		this.balance=balance;
	}

	public void withdraw(double amount) throws InvalidBalanceException{
		if (amount>balance) {
			throw new InvalidBalanceException("Balance cannot be less than 0");
		}
		balance=balance-amount;
	}

	public long getAccountNo() {
		return account_no;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}