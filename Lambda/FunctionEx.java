package Lambda;
import java.util.function.Function;
public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> obj=x-> x*x;
		// Input & Output           //6   6*6
		System.out.println(obj.apply(6));
	}
}
