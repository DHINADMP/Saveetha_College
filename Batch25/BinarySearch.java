package Batch25;
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= {1,4,7,13,18,19};
		int target=20;
		int l=0;int r=arr.length-1;
		while(l<=r) {
			int mid =(l+r)/2;
			if(arr[mid]==target) {
				System.out.println("True Index is " +mid );
				return;
			}
			else if(arr[mid]<target) {
				l=mid+1;
			}else{
				r=mid-1;
			}
		}
		System.out.println("False");
	}

}
