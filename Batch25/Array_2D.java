package Batch25;
import java.util.Scanner;
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// starts form 0
//		column
//		 |
//		 3 4 2 -> row
//		 5 6 6
//		 4 6 2
		
		// 5 5 -2D Array
//		00 01 02 03 04
//		10 11 12 13 14
//		20 21 22 23 24
//		30 31 32 33 34
//		40 41 42 43 44
		
//		int[][] arr= {{1, 2, 3, 4, 5},
//					  {6, 7, 8, 9, 10},
//					  {11,12,13,14,15},
//					  {16,17,18,19,20},
//					  {21,22,23,24,25}};
//		       arr[4][4]=26;
//		System.out.println(arr[4][5]);
		
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) { // 
			for(int j=0;j<col;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
