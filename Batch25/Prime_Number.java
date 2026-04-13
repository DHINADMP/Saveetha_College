package Batch25;
import java.util.Scanner;
public class Prime_Number {

	public static void main(String[] args) {
//		for(int i=1;i<=100;i++) {
//			int divisors =0;
//			for(int j=1;j<=i;j++) {
//				if(i%j==0) {
//					divisors++;
//				}
//			}
//			if(divisors==2) {
//				System.out.println("Prime Number "+i);
//			}
//		}
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int divisors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				divisors++;
			}
		}
		if(divisors==2) {
			System.out.println("Prime Number "+num);
		}
		else {
			System.out.println("its not a Prime Number "+num);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
