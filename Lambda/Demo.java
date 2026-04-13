package Lambda;
interface Dad{
	public void work();
	default void Bike() {// this is not abstract
		System.out.println("Bike is there...");
	}
}
interface Mom{
	abstract public void HomeWork();
	static void Car() { // this is not abstract
		System.out.println("Car is there...");
	}
}
interface GrandFather{
}
class child implements Dad,Mom,GrandFather{
	@Override
	public void work() {
	}
	@Override
	public void HomeWork() {
		System.out.println("I am doing Maths Homework");	
	}
}
public class Demo {
	public static void main(String[] args) {
		child obj=new child();
		obj.Bike();
		obj.HomeWork();
		Mom.Car();
	}
}

// ->