package GenericExample;
// Number-integer,float,double
class Calculator<T extends Number>{
	T num; // 5
	Calculator(T num){
		this.num=num;
	}
	double Square() {
		return num.doubleValue()*num.doubleValue();
		        // 5.0*5.0
		        // 25.0
	}
}
public class Bounded_Generic {
	public static void main(String[] args) {
		Calculator<Integer> obj=new Calculator(5.0);
		double ans=obj.Square();
		System.out.println(ans);
	}
}
