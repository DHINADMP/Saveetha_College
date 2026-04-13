package Batch25;
import java.util.Scanner;
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          8 4 2 1		
//		2=> 0 0 1 0 -Even
//	    3   0 0 1 1
//	    4   0 1 0 0 - Even
//	    5   0 1 0 1
//	    6   0 1 1 0 - Even
//	    7   0 1 1 1
//	    8   1 0 0 0 - Even
//	    9   1 0 0 1
		
//		int num=36;
//		if((num&1)==0) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("ODD");
//		}
//			int num=68;
//			if((num/2)*2==num) {
//				System.out.println("Even");
//				System.out.println("Sucessfully Founded");
//			}
//			else {
//				System.out.println("ODD");
//			}

			
		// mark 40 > Pass
//        60 > c Grade
//        80 > B Grade
//        90 > A Grade
//        95 > A+ Grade
			Scanner obj=new Scanner(System.in);
			int marks=obj.nextInt();
			if(marks>=40) { //->1st
				System.out.println("He is Getting Pass Mark");
				if(marks>=60) { //->2nd 
					System.out.println("He is Getting C Grade");
					if(marks>=80) { //->3rd
						System.out.println("He is Getting B Grade");
						
						if(marks>=90) { //->4th
							System.out.println("He is Getting A Grade");
							
							if(marks>95) { //->5th
								System.out.println("He is Getting A+ Grade");
							}else {
								System.out.println("He is not Getting A+ Grade");
							}
						}else {
							System.out.println("He is not Getting A Grade");
						}
						
					}else {
						System.out.println("He is not Getting B Grade");
					}
				}else {	
					System.out.println("He is not Getting C Grade");
				}
				
			}else {
				System.out.println("He is Fail...!");
			}
			
			
//			if(false) {
//				
//			}else {
//				if(true) {
//					System.out.println("This is Else Bolck");
//				}
//			}
			
			
	
			
	}

}
