package StreamEXamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String> obj=Arrays.asList("Java","Python","C","C++",
			"Kotlin","Java Script");
//	obj.forEach(Language -> System.out.println(Language));
//	// Lambda
	obj.forEach(System.out::println); // Steam
	// Stream - Operations - result
	obj.stream().map(String :: toUpperCase).forEach(System.out::println);
	}

}
