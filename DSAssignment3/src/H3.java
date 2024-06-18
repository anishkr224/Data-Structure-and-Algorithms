
import java.util.Scanner;

public class H3 {
	    public static void main(String args[]){
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter the String: ");
	        String str = sc.nextLine(); 
	            if(isPalindrome(str,0,str.length()-1)==true) {
		        	System.out.println("Yes it is a pallindrome String.");
		        }else {
		            System.out.println("No it is not a pallindrome String.");
		    }
	    }
	    public static boolean isPalindrome(String str,int i, int j){
	        if (str.charAt(i)!=str.charAt(j))
	            return false;
	        else if (i>=j)
	        	return true;
	        else
	            return isPalindrome(str,i+1,j-1); 
	        
	    } 
}