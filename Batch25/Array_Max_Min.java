package Batch25;
import java.util.Scanner;
public class Array_Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<len;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);
		int min=max;
		for(int i=0;i<len;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);
		
		
		// 3 5 1 2 4 6 7 8
		
		
		
		
		
		
		
		
		
		
		
	}

}
