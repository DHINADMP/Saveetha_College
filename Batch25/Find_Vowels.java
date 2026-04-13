package Batch25;
import java.util.Scanner;
public class Find_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine(); // i am in class
		StringBuilder sb=new StringBuilder(value);
		StringBuilder ans=new StringBuilder("");
		for(int i=0;i<sb.length();i++) {
			char temp=sb.charAt(i);
			if(temp=='a'||temp=='e'||temp=='i'
					||temp=='o'||temp=='u') {
				ans.append("*");
			}else {
				ans.append(temp);
			}
		}
		System.out.println(ans);
	}
	// m n th clss
}
