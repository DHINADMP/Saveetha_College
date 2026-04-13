package Batch25;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{2,1,3},{3,1,2}};
		int[] row=arr[1].clone();
		 String ans=Arrays.toString(row);
		System.out.println(ans);
	}

}
