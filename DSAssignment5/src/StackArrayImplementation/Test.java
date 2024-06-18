package StackArrayImplementation;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack stk=new Stack();
		while(true){
			System.out.println("*********************");
			System.out.println("0: Exit");
			System.out.println("1: Display");
			System.out.println("2: Push");
			System.out.println("3: Pop");
			System.out.println("*********************");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			System.out.println("*********************");
			switch(ch){
				case 0: return;
				case 1: stk.display(); break;
				case 2: System.out.println("Enter element to push:");
				        int ele=sc.nextInt();
				        stk.push(ele);
				        break;
				case 3: stk.pop(); break;
				default: System.out.println("Invalid choice");
			}
		}
	}

}