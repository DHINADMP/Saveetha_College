package Batch25;
import java.util.Scanner;
public class Opposite_Sign {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		// Opposite_Sign 
        boolean ans=((a<0&&b<0)||a>0&&b>0)?false:true;
        System.out.println(ans);
        
	}

}
