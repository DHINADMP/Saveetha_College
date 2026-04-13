package Batch25;
import java.util.Scanner;
public class Array_Sorted_Not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		boolean isSorted=true;
		for(int i=0;i<len-1;i++) {
			if(arr[i]>arr[i+1]) {
				isSorted=false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("This is Sorted Array");
		}else {
			System.out.println("This is not a Sorted Array");
		}
	}
	
//	1  2  3  4  5
//	6  7  8  9  10
//	11 12 13 14 15
//	16 17 18 19 20
//	21 22 23 24 25
	
	
	
	
	
	
	
	
	
	
	
	

}
