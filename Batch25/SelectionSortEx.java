package Batch25;

import java.util.Arrays;

public class SelectionSortEx {
	public static void SelectionSort(int[] arr,int len) {
		for(int j=0;j<len;j++) {
		int min=arr[j];
		int index=j;
		for(int i=j+1;i<len;i++) {
			if(arr[i]<min) {
				min=arr[i];
				index=i;
			}
		}
		int temp=arr[j];
		arr[j]=arr[index];
		arr[index]=temp;
		}
	}
	public static void main(String[] args) {
		int[] arr= {23,54,12,76,89,27,10};
		int len=arr.length;
		SelectionSort(arr,len);
		System.out.println(Arrays.toString(arr));
	}
}


















