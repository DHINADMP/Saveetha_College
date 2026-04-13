package Opps;
final class Tv{
	 final void Hotstor() {
		System.out.println("its not all "
				+ "Display sharing");
	}
	void album() {
		System.out.println("it will allow "
				+ "Display sharing");
	}
}
class phone extends Tv{
	
	void Hotstor() {
		System.out.println("its will allow only sound ");
	}
}
public class FInalEx {
	public static void main(String[] args) {
//		final float pi=3.14f;
//		// pi=3.15f;
//		System.out.println(pi);
		phone obj=new phone();
		obj.Hotstor();
		obj.album();
	}
}
