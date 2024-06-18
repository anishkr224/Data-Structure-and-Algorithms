import java.util.Scanner;

class  MarksOutOfBoundException extends Exception{
	 MarksOutOfBoundException(String s){
		 super(s);
	 }
}
class Student{
	String name;
	int mark;
	
	Student(String name,int mark){
		this.name=name;
		this.mark=mark;
	}
	void display() {
		System.out.println(name+" has got "+mark);
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student: ");
		String name=sc.next();
		System.out.println("Enter marks: ");
		int mark=sc.nextInt();
Student s1=new Student(name,mark);
try {
	if(s1.mark>100) {
		throw new MarksOutOfBoundException(" Mark can't be greater than 100");
	}
	else {
		s1.display();
}
}
	catch (Exception e) {
		System.out.println(e);
	}
	}

}
