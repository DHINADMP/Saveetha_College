//package Batch25;
//import java.util.Scanner;
//public class ExceptionEx { // Error Handlind
//	public static void main(String[] args) {
//		// Predefine Errors
//		// UserDefine Errors
//		// Predefine
//		Scanner sc=new Scanner(System.in);
//		int num1=sc.nextInt();
//		int num2=sc.nextInt();
//		int[] arr=new int[num1];
//		try {
////			System.out.println(arr[5]);
//			System.out.println(num1/num2);
//		}
//		
//		catch(Exception error) {
////			System.out.println("You wan to give "
////					+ "Min of length 6");
//			System.out.println(error);
//			System.out.println("must your give the "
//					+ "secdong vale more than 0");
//		}	
//		finally {  // Running after the Try Catch Block
//		System.out.println("This is main Method");
//		System.out.println("Running...!");
//		}
//	}
//
//}



package Batch25;
import java.util.Scanner;
public class ExceptionEx { // Error Handlind
	static void check(int age) throws Exception{
		if(age<18) {
			throw new Exception("not Eligible for Vote");
		}else {
			System.out.println("Eligible for Vote");
		}
	}
	public static void main(String[] args){
		
		// UserDefine Errors
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		try {
			check(Age);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

