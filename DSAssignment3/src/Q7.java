import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("**********");
			System.out.println("0. Exit");
			System.out.println("0. the factorial of a number");
			System.out.println("0. X^N for two numbers X, N");
			System.out.println("0. GCD of two number");
			System.out.println("0. Binary equivalent of a decimal number");
			System.out.println("0. Product of two numbers");
			System.out.println("**********");
			System.out.println("Enter choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 0: return;
			case 1: System.out.println("Enter a no. to get factorial of: ");
			int n=sc.nextInt();
			System.out.println("Factorial is: "+fact(n));
				break;
			case 2: System.out.println("Enter a two no. x&n to get x^n of: ");
			int n=sc.nextInt();
			in
				}
			}
	}
		public static int fact(int n) {
			if(n==0) {
				return 1;
			}else {
				return n*fact(n-1);
			}
		}

}
