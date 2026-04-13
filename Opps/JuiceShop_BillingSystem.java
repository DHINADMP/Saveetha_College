package Opps;
import java.util.Scanner;
public class JuiceShop_BillingSystem {
		static void Product() {
			    System.out.println("Select the juice");
				System.out.println("1-> Apple rate=70rs");
				System.out.println("2-> mango rate=50rs");
				System.out.println("3-> Watermelon =40rs");	
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int GrantTotal=0;
		System.out.println("How many juice you want");
		int juice_cups=sc.nextInt();
		for(int i=juice_cups;i>0;i--) {
			Product();
			System.out.println("You must select 1 =Apple or 2 =mango or 3 = Watermelon");
			int num=sc.nextInt();
			switch(num) {
			case 1:{
				System.out.println("Your selected Apple");
				GrantTotal +=70;
				break;
			}
			case 2:{
				System.out.println("Your selected mango");
				GrantTotal +=50;
				break;
			}
			case 3:{
				System.out.println("Your selected Watermelon");
				GrantTotal +=40;
				break;
			}
			default :{
				System.out.println("You must select 1 or 2 or 3");
				i++;
			}
			}
		}
		System.out.println("Your final Price is : "+GrantTotal);
	}

}





























