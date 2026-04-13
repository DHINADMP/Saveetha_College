package Batch25;
import java.util.Scanner;
public class Matrix_Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] matrix1=new int[row][col];
		int[][] matrix2=new int[row][col];
		int[][] result=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix2[i][j]=sc.nextInt();
			}
		}
//		ij
//		00 01 02   00 01 02
//		10 11 12   10 11 12
//		20 21 22   20 21 22
		for(int i=0;i<row;i++) { // matrix1 row
			for(int j=0;j<row;j++) {  // 3
				for(int k=0;k<col;k++) {
					result[i][j] =result[i][j]+
							(matrix1[i][k]*matrix2[k][j]);
				}
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
