package QueueArrayImplementation;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		while(true){
			System.out.println("*********************");
			System.out.println("0: Exit");
			System.out.println("1: Display");
			System.out.println("2: Insert");
			System.out.println("3: Delete");
			System.out.println("*********************");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			System.out.println("*********************");
			switch(ch){
				case 0: return;
				case 1: q.display(); break;
				case 2: System.out.println("Enter element to insert: ");
				        int ele=sc.nextInt();
				        q.insert(ele);
				        break;
				case 3: q.delete(); break;
				default: System.out.println("Invalid choice");
			}
		}
	}
}