package Opps;

// Overriding => Run Time polymorphisms
class lab{
	void Lab() {
		System.out.println("Your in Lab");
	}
}
class Staff1 extends lab{
	void Work() {
		System.out.println("To maintain a Lab");
	}
}
class Staff2 extends Staff1{
	@Override
	void Work() {
		System.out.println("To maintain a Lab");
		System.out.println("To maintain lab Students");
		super.Work();
	}
}
class Staff3 extends Staff2{
	void Work() {
		System.out.println("To maintain a Lab");
		System.out.println("To maintain lab Students");
		System.out.println("To maintain lab EcoSystem");
		super.Work(); // helps to asscessing the Previous Overriding Values
	}
}
public class OverridingEx {
	public static void main(String[] args) {
		Staff3 obj=new Staff3();
		obj.Work();
	}
}
