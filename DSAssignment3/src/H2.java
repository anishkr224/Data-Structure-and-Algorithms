import java.util.Scanner;
public class H2 {

		    public static void main(String args[]){
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter number of elements in the array: ");
		        int n=sc.nextInt();
		        int a[]=new int[n];
		        System.out.println("Enter "+n+" number of elements in ascending order: ");
		        for (int i=0;i<n;i++)
		            a[i]=sc.nextInt();
		            System.out.println("Enter the element to search: ");
		        int ele=sc.nextInt();
		        int binSea=binarySearch(a,ele,0,a.length-1);
		        if(binSea==-1) {
		        	System.out.println("The "+ele+" is not present in the array");
		        }else {
		            System.out.println("The "+ele+" is present at index "+binSea);
		    }
		    }
		    public static int binarySearch(int a[],int ele,int lb,int ub){
		   	 int mid=(lb+ub)/2;
		   		        if(lb>ub)
		   		           return -1;
		   		        else if(a[mid]==ele)
		   		                return mid;
		                   else if(a[mid]>ele)
		   		                return binarySearch(a,ele,lb,mid-1);
		   		        else
		   		            return binarySearch(a,ele,mid+1,ub);
		   		        }
	}