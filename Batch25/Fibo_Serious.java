package Batch25;
import java.util.Scanner;
public class Fibo_Serious {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int first=0;
		int second=1;
		for(int i=1;i<=length;i++) {
			int third=first+second;
			System.out.print(first+" ");
			first=second;
			second=third;
		}

	}

}
