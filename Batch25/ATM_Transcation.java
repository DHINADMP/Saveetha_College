package Batch25;
class Account{
	int balance =1000;
	void Balance(int pass) {
		if(pass==3560) {
			System.out.println("Your Current Balance is "+balance);
		}else {
			System.out.println("Your Entering Wrong Password");
		}
	}
	void deposit(int Amount) {
		balance +=Amount;
		System.out.println("Deposit Sucessfull "+Amount+"rs...!");
	}
	void Widthdraw(int Amount,int pass) {
		if(pass==3560) {
		if(Amount>balance) {
			System.out.println("insufficient Balance ...!");
			return;
		}
		balance -=Amount; // balance=balance-Amount
		System.out.println("Widthdraw Sucessfull "+Amount+"rs...!");
	   }
		else {
			System.out.println("Your Entering Wrong Password");
		}
	}
}
public class ATM_Transcation {
	public static void main(String[] args) {
		Account my=new Account();
		my.Balance(3560);
		my.deposit(10000);
		my.Balance(3560);
		my.Widthdraw(6000, 3566);
		my.Balance(3560);
	}
}
