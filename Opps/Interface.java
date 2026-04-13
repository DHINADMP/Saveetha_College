package Opps;
interface SmartTv{
	void Display();
	void smartTv();
}
interface Laptop{
	void laptop();
}
interface Computer{
	void computer();
}
class mobile implements SmartTv,Laptop,Computer{ // multiple
	public void Display() {
		System.out.println("This is Mobile Display");
	}
	public void smartTv() {
		System.out.println("This is SmartTv Display");
	}
	public void laptop() {
		System.out.println("This is Laptop Display");
	}
	public void computer() {
		System.out.println("This is Computer Display");
	}
}
public class Interface {
	public static void main(String[] args) {
		mobile obj=new mobile();
		obj.Display();
		obj.smartTv();
		obj.laptop();
		obj.computer();
	}
}
