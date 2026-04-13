package Lambda;
import java.util.function.Predicate;
public class PredictorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> obj= x-> x > 18;
  // (Boolean Values)             // 19 > 18;
		System.out.println(obj.test(19));
		System.out.println(obj.test(14));
	}

}
