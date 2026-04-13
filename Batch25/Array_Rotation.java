package Batch25;
import java.util.Scanner;
public class Array_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 2 3 4 5
		// last =len-1; step-1
		//  1 1 2 3 4 step-2
		// arr[0]=last step-3
		// 5 1 2 3 4
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=k%len;
		for(int j=1;j<=k;j++) {
		// step -1 Last Value Refrence
		int last=arr[len-1];
		// step-2 Traverse
		// 1 2 3 4 5
		// 0 1 2 3 4
		for(int i=len-1;i>0;i--) { 
			arr[i]=arr[i-1];
		}
		// step =3
		arr[0]=last;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
