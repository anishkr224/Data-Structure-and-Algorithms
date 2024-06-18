package Q1;

import java.util.Scanner;
public class Test{

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Phone p1=new Phone();
p1.area_code=212;
p1.exchange=767;
p1.number=8900;
System.out.println("Input code, exchange, number: ");
Phone p2=new Phone();

int c=sc.nextInt();
int e=sc.nextInt();
int n=sc.nextInt();
p2.setPhone(c,e,n);

System.out.print("My phone number is ");
p1.display();
System.out.print("Your phone number is ");
p2.display();
	}

}
