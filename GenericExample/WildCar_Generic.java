package GenericExample;
import java.util.Arrays;
import java.util.List;
public class WildCar_Generic { 
		static void print(List<?> ans) {
			for(Object a:ans) {
				System.out.println(a);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=Arrays.asList(1,2,3,4,5);
		List<Character> obj2=Arrays.asList('A','B','C','D','E');
		List<String> obj3=Arrays.asList("Java",
				"Python","Kotlin","Dart");
		print(obj);
		print(obj2);
		print(obj3);
	}
}
