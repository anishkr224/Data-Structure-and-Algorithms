package Q5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Input Principal Time and Rate: ");
long p=sc.nextInt();
int t=sc.nextInt();
double r=sc.nextDouble();
Deposit ob=new Deposit(p,t,r);
System.out.println("The details are: ");
ob.calc_amt(p, t, r);
ob.display();
	}

}
