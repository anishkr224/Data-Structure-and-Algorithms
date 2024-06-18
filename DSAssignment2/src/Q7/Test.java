package Q7;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name, age, Eid, salary: ");
		String name=sc.next();
		int age=sc.nextInt();
		int Eid=sc.nextInt();
		double salary=sc.nextDouble();
		
Employee e1=new Employee(name,age,Eid,salary);
e1.empDisplay();
	}

}
