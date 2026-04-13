package Batch25;
import java.util.Scanner;
public class Else_If_Ladder {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int days=sc.nextInt();
//		if(days==1) {
//			System.out.println("Sunday");
//		}
//		else if(days==2) {
//			System.out.println("Monday");
//		}
//		else if(days==3) {
//			System.out.println("Tuesday");
//		}
//		else if(days==4) {
//			System.out.println("Wednsday");
//		}
//		else if(days==5) {
//			System.out.println("Good Day");
//		}
//		else {
//			System.out.println("Invalid Day...!");
//		}
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char symbol=sc.next().charAt(0);
		switch(symbol) {
		case '+' :{
			System.out.println(num1+num2);
			break;
		}
		case '-' :{
			System.out.println(num1-num2);
			break;
		}
		case '*' :{
			System.out.println(num1*num2);
			break;
		}
		case '/' :{
			System.out.println(num1/num2);
			break;
		}
		case '%' :{
			System.out.println(num1%num2);
			break;
		}
		default :{
			System.out.println("You Need to Enter for + - * / %");
		}
		// break- only Switch and Condtitonals
		}
		
	}

}
