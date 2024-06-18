package H2;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book b[]=new Book[5];
		for(int i=0; i<b.length;i++) {
		System.out.println("Enter name, edition, price of Book: "+(i+1));
		String BName=sc.next();
		int BEdition=sc.nextInt();
		double BPrice=sc.nextDouble();
			b[i]=new Book(BName,BEdition,BPrice);
		}
		for(int i=0; i<b.length;i++) {
			b[i].display();
		}
		int index=0;
		double max=b[0].BPrice;
		for(int i=0; i<b.length;i++) {
			if(max<b[i].BPrice) {
				max=b[i].BPrice;
				index=i;
			}
		}
		System.out.println("The book with the maximum price is:");
		b[index].display();
	}
}
