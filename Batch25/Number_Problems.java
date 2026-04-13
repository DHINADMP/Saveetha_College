package Batch25;
import java.util.Scanner;
public class Number_Problems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int original=num;
//		int reverse=0; //85653
//		while(num>0) {
//			int temp=num%10; // 6
//			reverse=(reverse*10)+temp;
//			num =num/10;
//		}
//		System.out.println(reverse);
//		
//		if(reverse==original) {
//			System.out.println("Palindrome..!");
//		}else {
//			System.out.println("Not a Palindrome..!");
//		}
		
		//Sum of Digits  578302
		
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int sum=0;
//		while(num>0) {
//			sum=sum+(num%10);
//			num =num/10;
//		}
//		System.out.println(sum);
		
		
		// Length of Number
//		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		int length=0;
//		while(num>0) {
//			num =num/10;
//			length++;
//		}
//		System.out.println(length);
		
		// Amstrong Number
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int check=num;
		int original=num;
		int length=0;
		int Amstrong=0;
		while(num>0) {
			num =num/10;
			length++;
		}
		System.out.println(length);
		
		while(original >0) { // 153
			int temp=original%10; //5
			int square=1; // 
			for(int i=1;i<=length;i++) {
				square = temp*square;
			}
			Amstrong =Amstrong+square;
			original =original/10;
		}
		System.out.println(Amstrong);
		if(check==Amstrong) {
			System.out.println("This is a Amstrong");
		}else {
			System.out.println("This is not a Amstrong");
		}
		
		
//		int mark1=95;
//		int mark2=45;
//		int mark3=65;
//		int mark4=75;
//		int mark5=85;
//		arry = multiple valus in a singel data type
//			int arry -> Integer values
//			char arry-> Characer values
//			String Arry-> Straing values
//		[]-Syntax of Array
//		
//		index starts from (0);
//		length starts form (1);
		
		
//		int 
		
		
		
		
		
		
		
	}

}
