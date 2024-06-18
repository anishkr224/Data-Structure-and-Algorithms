import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList sl=new LinkedList();
		sl.display();
		sl.create();
		while(true)
		{
			System.out.println("*********************");
			System.out.println("0: Exit");
			System.out.println("1: Display");
			System.out.println("2: Count");
			System.out.println("3: Search");
			System.out.println("4: InsBeg");
			System.out.println("5: InsEnd");
			System.out.println("6: InsAny");
			System.out.println("7: DelBeg");
			System.out.println("8: DelEnd");
			System.out.println("9: DelAny");
			System.out.println("10: Reverse");
			System.out.println("11: Sort");
			System.out.println("*********************");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			System.out.println("*********************");
			switch(ch)
			{
				case 0: return;
				case 1: sl.display(); 
						break;
				case 2: System.out.println("No. of nodes="+sl.count());
						break;
				case 3: System.out.println("Enter regdN to search");
				 		int reg=sc.nextInt();
				 		Node ref=sl.search(reg);
				 		System.out.println("Found at reference: "+ref);
				 		break;
				case 4: sl.insBeg(); break;
				case 5: sl.insEnd(); break;
				case 6: sl.insAny(); break;
				case 7: sl.delBeg(); break;
				case 8: sl.delEnd(); break;
				case 9: sl.delAny(); break;
				case 10:sl.reverse(); break;
				case 11:sl.sort(); break;
				default: System.out.println("Invalid choice");
			}
		}
	}
}