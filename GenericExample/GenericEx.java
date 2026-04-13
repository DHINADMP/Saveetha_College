package GenericExample;
import java.util.List;
import java.util.ArrayList;
public class GenericEx {

	public static void main(String[] args) {
		// Generic 
		// Generic it will allow to write a code
		 // in flexibe reusable, 
		// this is fixed data types;
		List<String> obj=new ArrayList<String>();
		int[] arr=new int[5];
//		obj.add(3);
//		obj.add(1);
		obj.add("Java");
//		obj.add('A');
//		obj.add(5);
//		obj.add('D');
		obj.add("Class");
//		obj.add(2);
//		obj.add('C');
		//obj.sort(null);
		System.out.println(obj);
	}

}
