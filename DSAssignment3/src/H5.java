public class H5 {
	public static void main(String args[]){
		int n = 4;
		Tower(n,'A','B','C');
	}
	public static void Tower(int n, char A,char B, char C){
		if (n>0) {
		Tower(n-1,A,C,B);
		System.out.println(A+"->"+B);
		Tower(n-1,C,B,A);
	}
	}
}
