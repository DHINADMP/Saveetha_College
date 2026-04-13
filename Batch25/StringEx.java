package Batch25;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    String name="Batch25";
//		String name=new String("Batch25");
//		//name="Batch26";// 
//		System.out.println(name);
		String name="Batch 25";
		String name2="batch 25 is";
		String[] arr=name.split(" ");
//		for(int i=arr.length-1;i>=0;i--) {
//		System.out.print(arr[i]+" ");
//		}
		System.out.print(name.compareToIgnoreCase(name2));
	}

}
