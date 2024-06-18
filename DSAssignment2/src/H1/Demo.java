package H1;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sales: ");
		double n=sc.nextDouble();
		if(n<0) {
			System.out.println("Invalid Input");
		}else {
Commission c1=new Commission(n);
System.out.println("Commision is: "+c1.getCommission(n));

	}
	}
}
