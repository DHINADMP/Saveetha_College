package Lambda;
import java.util.function.Consumer;
public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> obj= name-> 
		System.out.println("This is my Class "+name);
		// (input and no return);
		obj.accept("Batch-25");
	}

}
