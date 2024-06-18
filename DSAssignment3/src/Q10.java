import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String s=sc.nextLine();
	        System.out.println("Reversed string is: "+reverse(s));
	    }
	    public static String reverse(String s) {
	        if (s.isEmpty()) {
	            return s;
	        }else {
	            return reverse(s.substring(1)) + s.charAt(0);
	    }
	    }
}