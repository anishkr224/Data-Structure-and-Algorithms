import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		Integer a[]= new Integer[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Integer Array contains: ");
		printArray(a);
		Double b[]= new Double[n];
		System.out.println("Enter array elements: ");
		for(int i=0; i<b.length;i++) {
			b[i]=sc.nextDouble();
		}
System.out.println("Double Array contains: ");
printArray(b);
	}
	public static < E > void printArray( E[] inputArray) {
		for(int i=0; i<inputArray.length;i++) {
			System.out.print(inputArray[i]+" ");
		}
		System.out.println();
	}
}
