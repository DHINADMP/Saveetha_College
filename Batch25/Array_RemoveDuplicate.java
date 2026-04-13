package Batch25;
import java.util.Scanner;
public class Array_RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		//3 5 3 2 3 4 5
		//3 5 2 3 4 5 
		//3 5 2 4
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j;k<len-1;k++) {
						arr[k]=arr[k+1];
					}
					len--;
					j--;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
