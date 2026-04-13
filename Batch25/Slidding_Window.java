package Batch25;
import java.util.Scanner;
public class Slidding_Window {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		// 3 5 6 2 2 3 4
		// 3
		int k=sc.nextInt(); // times to Slide
		int max=0;
		for(int i=0;i<=len-k;i++) {
			int value=0;
			int j=i;
			while(j<i+k) {
				value=value+arr[j];
				j++;
			}
			if(max<value) {
				max=value;
			}
		}	
		System.out.println(max);
	}

}
