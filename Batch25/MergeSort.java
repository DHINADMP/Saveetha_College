package Batch25;
import java.util.Arrays;
public class MergeSort {
	public static void solve(int[] arr1,int start,int end) {
		if(end-start==1) {
			return;
		}
		int mid=(start+end)/2;
		solve(arr1,start,mid); // left Array Recursion
		solve(arr1,mid,end);  // Right array recursion
		Merge(arr1,start,mid,end);
	}
	public static void Merge(int[] arr1,int start,int mid,int end) {
		int[] ans=new int[end-start];
		int i=start;
		int j=mid;int k=0;
		while(i<mid &&j<end) {
			if(arr1[i]<arr1[j]) {
				ans[k]=arr1[i];
				k++;
				i++;
			}else {
				ans[k]=arr1[j];
				k++;
				j++;
			}
		}
		while(i<mid) {
			ans[k]=arr1[i];
			k++;
			i++;
		}
		while(j<end) {
			ans[k]=arr1[j];
			k++;
			j++;
		}
		//System.out.println(Arrays.toString(ans));
		for(int itr=start;itr<end;itr++) {
			arr1[itr]=ans[itr-start];
		}
	}
	public static void main(String[] args) {
		int[] arr1= {4, 6, 8 , 2, 1, 4, 7, 10, 16};
		solve(arr1,0,arr1.length);
//		int mid=arr1.length/2;
//		Merge(arr1,0,mid,arr1.length);
		
		System.out.println(Arrays.toString(arr1));
	}
}
