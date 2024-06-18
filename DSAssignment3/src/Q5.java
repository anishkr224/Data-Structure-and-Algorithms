import java.util.Scanner;
public class Q5 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array: ");
			int n=sc.nextInt();
			Integer a[]=new Integer[n];
			System.out.println("Enter array elements: ");
			for (int i=0; i<a.length; i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the element to search: ");
			int ele=sc.nextInt();
			System.out.println("Number of times "+n+" present in the array is "+count(a,n));
		}

		public static <T> int count(T[] array, T item) {
			int count=0;
			for (int i=0; i<array.length; i++) {
				if (array[i].equals(item)) {
					count++;
				}
			}
			return count;

		}
	}
//equals() method istead of array[i]==ele, because 
// in case array containing String type then it will show error