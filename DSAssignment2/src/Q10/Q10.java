package Q10;
import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Test test=new Test();
		test.input();
		
		System.out.print("Enter score 1: ");
        int score1 = sc.nextInt();
        System.out.print("Enter score 2: ");
        int score2 = sc.nextInt();
        
        int grandTotMark=test.mark1+test.mark2+score1+score2;
        test.output();
        System.out.println("Grand Total Mark="+grandTotMark);
        System.out.println("Total score="+(score1+score2));
	}

}
