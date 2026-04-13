package Batch25;

public class FindTarget_1D {
	public static void main(String[] args) {
		int[] arr= {4,5,2,6,7};
		int target=15;
		boolean isFound=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					isFound=true;
					break;
				}
			}
		}
		if(isFound) {
		System.out.println("Element is Found");
		}else {
			System.out.println("Element is not Found");
		}
	}
}


















