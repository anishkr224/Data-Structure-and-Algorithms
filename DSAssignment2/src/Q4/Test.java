package Q4;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of products: ");
int n=sc.nextInt();
Product p[] = new Product[n];

for(int i=0; i<p.length; i++) {
	System.out.println("Enter details of product "+(i+1));
	int id=sc.nextInt();
	double pr=sc.nextDouble();
	p[i]=new Product(id,pr);
}

System.out.println("\nDetails of purchased products: ");
for(int i=0; i<p.length; i++) {
	p[i].display();
}
System.out.println("Total price of purchased products: "+Product.tot_price);
	}

}
