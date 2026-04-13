package Batch25;
import java.util.Scanner;
public class Arrenging_Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int coins=sc.nextInt(); // 1
		int step=0; // 3
		int i=1; //  4
		while(i<=coins) {
			step++; 
			coins =coins-i;
			i++;
		}
		System.out.println(step);
	}
}
