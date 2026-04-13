package Batch25;
import java.util.Arrays;
import java.util.Scanner;
public class QuickSortEx {
		public static void QuickSort(int arr[],int low,int high) {
			if(low<high) {
				int pivotIndex=partition(arr,low,high);
				QuickSort(arr,low,pivotIndex-1); // Left
				QuickSort(arr,pivotIndex+1,high);// Right
			}
		}
		public static int partition(int arr[],int low,int high) {
			int pivot=arr[low];
			int i=low+1;
			int j=high;
			// [2 1 3 4 9 6 8]
			//        j i 
			while(i<=j) {
				// Moving i 
				while(i<=high && arr[i]<=pivot) {
					i++;
				}
				// Moving j 
				while(arr[j]>pivot) {
					j--;
				}
				if(i<j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			// Place the Pivot Inedx on array
			int temp=arr[low];
			arr[low]=arr[j];
			arr[j]=temp;
			return j;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int[] arr=new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		QuickSort(arr,0,len-1);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
