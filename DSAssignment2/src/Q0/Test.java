package Q0;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Student s1=new Student();
Student s2=new Student();

System.out.println("Input name roll and mark: ");
String n=sc.next();
int r=sc.nextInt();
double m=sc.nextDouble();
s1.setStudent(n, r, m);

System.out.println("Input name roll and mark: ");
String n1=sc.next();
int r1=sc.nextInt();
double m1=sc.nextDouble();
s2.setStudent(n1, r1, m1);
System.out.println("Student details: ");
s1.display();
s2.display();
	}

}
