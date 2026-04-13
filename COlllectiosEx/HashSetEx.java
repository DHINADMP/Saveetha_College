package COlllectiosEx;
import java.util.HashSet;
public class HashSetEx {

	public static void main(String[] args) {
		// Constrains
		// it will stores only for value(not Key pair)
		// it dosn't allow duplicates
		// it will allow only one null value
		// this is also not maintaing order
		// fast Operation
		
		HashSet obj=new HashSet();
		obj.add(2);
		obj.add(5);
		obj.add(7);
		obj.add(10);
		obj.add(null);
		obj.add(2);
		obj.add(5);
		obj.add(7);
		obj.add(null);
		System.out.println(obj);
		obj.isEmpty();
	}

}
