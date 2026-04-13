package Batch25;

import java.util.Arrays;

public class Single_Number {

	public static void main(String[] args) {
		int[] arr= {8,2,5,7,2,7,5};
		Arrays.sort(arr);
		//  2 2 5 5 7 7 8
		for(int i=0;i<arr.length;i +=2) {
			try {
			if(arr[i]==arr[i+1]) {
				continue;
			}else {
				System.out.println(arr[i]);
				break;
			}
			}catch(Exception E) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
