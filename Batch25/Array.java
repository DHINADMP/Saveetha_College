package Batch25;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		int Marks[]= {3,2,5,7,8,10};
//			Marks[2]=45;
		
//		for(int i=0;i<6;i++) {
//			System.out.print(Marks[i]+" ");
//		}
//		for(int a :Marks) {
//			System.out.print(a+" ");
//		} // 87 90 59 68 72
		Scanner obj=new Scanner(System.in);
		int len=obj.nextInt();
		int[] marks=new int[len];
		int sum=0;
		for(int i=0;i<len;i++) { 
			marks[i]=obj.nextInt();
		}
		for(int i=0;i<len;i++) { 
			sum=sum+marks[i];
		}
		System.out.println(sum);
		System.out.println((float)sum/len);
	}

}














