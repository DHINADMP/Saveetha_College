package Batch25;

public class Patterns {

	public static void main(String[] args)
	{
//		char letter ='A';
//		int num=1;
//	for(int i=5;i>=1;i--) { // 2 
//		for(int j=1;j<=i;j++) { // 1 2 3
//			System.out.print(num+" ");
//		}
//		num++;
//		System.out.println();
//	}
		
		
		for(int i=1;i<=5;i++) { 
			for(int j=4;j>=i;j--) {
			System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) { 
			for(int j=4;j>=i;j--) {
			System.out.print(" ");	
			}
			for(int j=1;j<=i;j++) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
  }
}














