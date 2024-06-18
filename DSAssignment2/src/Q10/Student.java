package Q10;
import java.util.Scanner;
public class Student {
	
String name;
int roll;

void input(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter name and roll no: ");
	name=sc.next();
	roll=sc.nextInt();
}
void output() {
	System.out.println("Name= "+name+" Roll= "+roll);
}
}
