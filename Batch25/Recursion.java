package Batch25;

// fibo_Serious
//public class Recursion {
//			static int fibo_serious(int num) {
//				if(num==0) {
//					return 0;
//				}
//				else if(num==1) {
//					return 1;
//				}
//				return fibo_serious(num-2)+fibo_serious(num-1);
//			}
//	public static void main(String[] args) {
//		int num=5;
//		for(int i=0;i<=num;i++) {
//			System.out.print(fibo_serious(i)+" ");
//		}		
//	}
//}

// Factorial


public class Recursion {
static int Factorial(int num) {
	if(num==1) {
		return 1;
	}
	return num*Factorial(num-1);
}
public static void main(String[] args) {
    int num=10;
    System.out.println(Factorial(num)); 	
   }
}
