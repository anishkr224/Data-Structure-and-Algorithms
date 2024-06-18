package Q3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of students: ");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0; i<s.length; i++) {
			s[i]=new Student();
		}
		for(int i=0; i<s.length; i++) {
			System.out.println("Input roll no, name, dsa mark of student "+(i+1)+":");
			int r=sc.nextInt();
			String nm=sc.next();
			double m=sc.nextDouble();
			
			s[i].getData(r, nm, m);
		}
			System.out.println("The details of the students are: ");
			for(int i=0; i<s.length; i++) {
				s[i].showData();
			}
			int topper=findTopper(s);
			System.out.println("The details of the topper is: ");
			s[topper].showData();
	}
	public static int findTopper(Student s[]) {
		int index=0;
		double max=s[0].DSA_Mark;
		for(int i=0; i<s.length; i++) {
			if(s[i].DSA_Mark>max) {
				max=s[i].DSA_Mark;
				index=i;
			}
		}
		return index;
	}

}
