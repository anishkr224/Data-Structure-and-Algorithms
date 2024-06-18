package H3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Distance d1=new Distance(9,2);
		Distance d2=new Distance(22,4);
		Distance d3=d1.sum(d1,d2);
		System.out.print("Distance 1: ");
		d1.display();
		System.out.print("Distance 2: ");
		d2.display();
		System.out.print("Sum of distances: ");
		d3.display();
	}

}
