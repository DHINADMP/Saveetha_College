package COlllectiosEx;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///[apple-2,apple-3,banana-3,jackfruit-2,orange-1,graps-0]
//      key-value
	 // Constrains 
	// it will be stores data in key-value pair 
	// it will allow duplicate the value
		
	// it will allow only one null key  and multiple 
				// null values
 //    it doesnot maintain the order
// 		O(1) time complexity
		HashMap obj=new HashMap();
		obj.put("apple", null);
		obj.put("banana", null);
		obj.put("jackfruit", 2);
		obj.put("orange", null);
		obj.put("graps", 3);
		obj.put("graps", 6);
		obj.put(null, 8);
		obj.put(null, 10);
		System.out.println(obj.get("graps"));
		System.out.println(obj.containsValue(10));
		System.out.println(obj.remove(null));
		System.out.println(obj);
		System.out.println(obj.size());

	}

}
