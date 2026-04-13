package Lambda;
@FunctionalInterface  // antations
// Functiona interface 
// it must want only one abstract method
interface add{
	abstract int Add(int a,int b);
	 default void sub() {
		 
	 }
    static void Mul() {
	
	}
    default void Div() {	
	}
}
public class Main {
	public static void main(String[] args) {
		add obj=(int a,int b)->{
			System.out.println("This is Lamba method");
			return a+b;
		};
		System.out.println(obj.Add(4, 6));
		
		add obj2=(int a,int b)->{
			System.out.println("This Adding Lambda Method");
			return a+b;
		};
		System.out.println(obj2.Add(7, 10));
	}
}
