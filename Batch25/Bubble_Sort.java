package Batch25;
import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		// len=5
	for(int j=1;j<=len;j++) {
		for(int i=0;i<len-1;i++) { // 4
			if(arr[i]>arr[i+1]) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			}
		}
	}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
