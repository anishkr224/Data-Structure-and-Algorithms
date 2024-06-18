import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter one number: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci number at position "+n+" is "+fibonacci(n));
    }
    public static int fibonacci(int n){
        if (n<=1)
            return n;
        else
            return (fibonacci(n-1)+fibonacci(n-2));
	}

}