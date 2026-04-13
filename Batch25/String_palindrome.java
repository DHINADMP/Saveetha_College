package Batch25;
import java.util.Scanner;
public class String_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();// laptop
		char[] reverse=new char[name.length()];
		int j=0;
		for(int i=name.length()-1;i>=0;i--) {
			char temp=name.charAt(i);
			reverse[j]=temp;
			j++;
			System.out.print(temp);
		}
		boolean IsPalindrome=true;// bad
								  // dab
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) !=reverse[i]) {
				IsPalindrome=false;
				break;
			}
		}
		if(IsPalindrome) {
			System.out.println("Its a Palindrome");
		}else {
			System.out.println("Its not a Palindrome");
		}
		
		
		// listen->6  freq +1 +1 +1 +1 +2 +1
		// silent->6  freq -1 -1 -1 -1 -1 -1 
		
		
		
		
		
		
		
		
		
		
		
	}

}
