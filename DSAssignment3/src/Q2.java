
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Four colors:");
		String colors[]= new String[4];
		
		for(int i=0;i<colors.length;i++){
			colors[i]=sc.next();
		}
		
		try {
			//System.out.println("Convert string to integer");
			//int n =Integer.parseInt(colors[0]);
			//System.out.println(n);
			
			Integer.parseInt(colors[0]);
		}
		//catch(Exception e){
		catch(NumberFormatException e) {
			System.out.println(e);
		}
			
		try {
			System.out.println("Enter one more colour: ");
			colors[4]=sc.next();
		}
		//catch(Exception e){
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally{
			sc.close();
			System.out.println("Entered colors are:");
			for(int i=0;i<colors.length;i++){
				System.out.println(colors[i]);
			}

		}
	
	}

}
