package Q2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Complex c1=new Complex();
System.out.println("Input real and imag value of 1st complex number: ");
int r1=sc.nextInt();
int i1=sc.nextInt();
c1.setData(r1,i1);

Complex c2=new Complex();
System.out.println("Input real and imag value of 1st complex number: ");
int r2=sc.nextInt();
int i2=sc.nextInt();
c2.setData(r2,i2);

System.out.println("1st complex no is: ");
c1.display();
System.out.println("2nd complex no is: ");
c2.display();

Complex c3=new Complex();
c3=c3.add(c1,c2);

System.out.println("Resultant complex no is: ");
c3.display();
	}

}
