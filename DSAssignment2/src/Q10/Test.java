package Q10;
import java.util.Scanner;
public class Test extends Student {
int mark1;
int mark2;
void input() {
	super.input();
	System.out.println("Enter marks: ");
	Scanner sc=new Scanner(System.in);
	mark1=sc.nextInt();
	mark2=sc.nextInt();
}
void output() {
	super.output();
	System.out.println("Mark1= "+mark1+" Mark2= "+mark2);
}
}
	
