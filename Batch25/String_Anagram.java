package Batch25;
import java.util.Arrays;
import java.util.Scanner;
public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		String name1=sc.nextLine();
//		String name2=sc.nextLine();
//		if(name1.length() !=name2.length()) {
//			System.out.println("Not a Anagram");
//			return;
//		}
//		int[] freq=new int[128];
//		for(int i=0;i<name1.length();i++) {
//			freq[name1.charAt(i)]++;
//			freq[name2.charAt(i)]--;
//		}
//		boolean isAnagram=true;
//		for(int i=0;i<128;i++) {
//			if(freq[i] !=0) {
//				isAnagram=false;
//				break;
//			}
//		}
//		if(isAnagram) {
//			System.out.println("A Anagram");
//		}else {
//			System.out.println("Not a Anagram");
//		}
		
		Scanner sc=new Scanner(System.in);
		String name1=sc.nextLine();
		String name2=sc.nextLine();
		if(name1.length() !=name2.length()) {
			System.out.println("Not a Anagram");
			return;
		}
		char[] arr1=new char[name1.length()];
		char[] arr2=new char[name2.length()];
		for(int i=0;i<name1.length();i++) {
			arr1[i]=name1.charAt(i);
			arr2[i]=name2.charAt(i);
		}
		// listen and silent
		// eilnst     eilnst
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("A Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		
		
		
		
	}

}
