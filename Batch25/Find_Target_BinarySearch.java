package Batch25;
import java.util.Scanner;
public class Find_Target_BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		//[1,5,6,9,12,15];
		// 0 1 2 3 4  5
		int target=27;
		int l=0;int r=len-1;
		while(l<=r) {
			int sum=arr[l]+arr[r];
			if(sum==target) {
				System.out.println(l+" "+r);
				return;
			}
			else if(sum>target) {
				r--;
			}else {
				l++;
			}
		}
		System.out.println("False Value is not There");
	}

}















