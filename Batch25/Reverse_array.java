package Batch25;
import java.util.Scanner;
public class Reverse_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int left=0;int right=len-1;
		while(left<right) {
			// left =a, right =b
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
		// 56 34 76 42 78 95
		
		
		
		
		
		
		
		
		
	}

}
