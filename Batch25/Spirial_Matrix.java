package Batch25;
import java.util.Scanner;
public class Spirial_Matrix {

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
		
		int top=0; int bottom=col-1; //matrix.length -1;
		int left=0; int right=row-1; //matrix[0].length-1;
		
		
		
		
		
		
		
//		00 01 02 03 04
//		10 11 12 13 14
//		20 21 22 23 24
//		30 31 32 33 34
//		40 41 42 43 44
		
		
		
		
		
		
		
		while(left<=right && top<=bottom) {
		for(int i=left;i<=right;i++) {
			System.out.print(arr[top][i]+" ");
		}
		top++;
		for(int i=top;i<=bottom;i++) {
			System.out.print(arr[i][right]+" ");
		}
		right--;
		for(int i=right;i>=left;i--) {
			System.out.print(arr[bottom][i]+" ");
		}
		bottom--;
		for(int i=bottom;i>=top;i--) {
			System.out.print(arr[i][left]+" ");
		}
		left++;
		}
		
	}

}

//   5 7 8 2 ==> 8
//   4 6 5 1 ==> 6
//   3 5 7 9 ==> 9
   
