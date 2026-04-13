package Batch25;
import java.util.Scanner;
public class Watter_bottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int No_Bottles=sc.nextInt();
		int No_Exchanges=sc.nextInt();
		// 15 
		// 4
		int drinked=No_Bottles; //18+1=19
		int empty =No_Bottles; // 6
		while(empty>=No_Exchanges) {
			int newBottles=empty/No_Exchanges;
			drinked=drinked+newBottles;
			empty =(empty%No_Exchanges)+newBottles;
		}
		System.out.println(drinked);
		
		
	}

}




// 2 fuel tank
 // Mian Tank 9
// additional tank =10
  // 1l = 10KM
 // 5 +5+1  110KM










