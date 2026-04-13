package Batch25;
public class InsertionSort {
	public static void Sort(int[] arr,int len) {
		for(int i=1;i<len;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--; // 0--
			}
			j++;
			arr[j]=key;
		}
	}
	public static void main(String[] args) {
		int[] arr= {4,6,2,3,1,7,15,10};
		int len=arr.length;
		Sort(arr,len);
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

		// 4,6,2,3,1,7,15,10













