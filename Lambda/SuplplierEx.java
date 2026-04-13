package Lambda;
import java.util.function.Supplier;
public class SuplplierEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Double> obj=()->Math.random();
		// (No input and Random outputs)
		System.out.println(obj.get());
	}

}
