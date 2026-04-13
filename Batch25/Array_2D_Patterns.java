package Batch25;

import java.util.Scanner;

public class Array_2D_Patterns {

	public static void main(String[] args) {
		
		// 5 5 -2D Array
//		00 01 02 03 04
//		10 11 12 13 14
//		20 21 22 23 24
//		30 31 32 33 34
//		40 41 42 43 44
		
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
//		if(i==0||j==0||i==row-1|| j==col-1) {
//			System.out.print(arr[i][j]+" ");
//		}else {
//			System.out.print("  ");
//		}
		
//		for(int i=0;i<row;i++) { 
//			for(int j=0;j<col;j++) {
//				if(i==j||i+j==row-1) {
//					System.out.print(arr[i][j]+" ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		boolean isfound=false;
		for(int i=0;i<row;i++) { 
			for(int j=0;j<col;j++) {
				if(arr[i][j]==17) {
					isfound=true;
				}
			}
		}
		if(isfound) {
			System.out.println("Element is Found");
		}
		else {
			System.out.println("Element is not Found");
		}
		// 1 2 3 4 5
//		   6 7 7 8 10
//		   11 12 13 14 15
//		   16 17 18 19 20
//		   21 22 23 24 25
		
		
		
		
		// 34 23 54 12 45
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
