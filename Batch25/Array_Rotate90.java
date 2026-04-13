package Batch25;

import java.util.Scanner;

public class Array_Rotate90 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		// step 1 Array Transpose
//		00 01 02   00 10 20
//		10 11 12   01 11 21
//		20 21 22   02 12 22
		for(int i=0;i<row;i++) { //2 
			for(int j=i+1;j<col;j++) { // 3
				int temp =arr[i][j]; // a
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		// Reverse Each Row
		for(int i=0;i<row;i++) {
			int left=0;int right=row-1;
			while(left<right) {
				int temp=arr[i][left];
				arr[i][left]=arr[i][right];
				arr[i][right]=temp;
				left++;
				right--;
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
