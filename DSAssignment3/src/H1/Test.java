package H1;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter account number:");
		int account_no=sc.nextInt();
		System.out.println("Enter balance:");
		double balance=sc.nextDouble();
		try {
			Bank b1=new Bank(account_no, name, balance);
			System.out.println("Details of the Account Holder:");
			System.out.println("Name: "+b1.getName());
			System.out.println("Account number: "+b1.getAccountNo());
			System.out.println("Balance: "+b1.getBalance());
			System.out.println("Enter the money to withdraw: ");
			double amount=sc.nextDouble();
			b1.withdraw(amount);
			System.out.println("After withdraw, Balance = "+b1.getBalance());

		} catch (InvalidBalanceException e) {
			System.out.println(e);
		}
	}

}
