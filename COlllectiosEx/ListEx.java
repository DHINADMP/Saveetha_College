package COlllectiosEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListEx {

	public static void main(String[] args) {
		// its allow duplicates
		// maintain that order
		// Ordered Collections
		ArrayList obj=new ArrayList(); // Dyamic Bounding
//		List<Integer> Sorted_rsult=new ArrayList();
		// no need to set Size
		// add()
		// remove()
		// get()
		// size()
		// contains();
		// sort();
		obj.add('t');
		obj.add('f');
		obj.add('w');
		obj.add('e');
		obj.add('a');
		obj.add(2,'d');
		obj.add(2,'A');
		obj.add(3,'c');
//		obj.remove(2);
//		obj.removeFirst();
//		obj.removeLast();
		
		System.out.println(obj);
		System.out.println(obj.get(3));
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		
		System.out.println(obj.size());
		
		if(obj.contains(15)) {
			System.out.println("This element is Presented "
					+ "on List");
		}else {
			System.out.println("This element is not Presented "
					+ "on List");
		}
		
		
		Collections.sort(obj);
		// it will be follow the rule
		// 1) all values must want to be a Integer or
		// all values must want to be a Character  or
		// all values must want to be a String  
		System.out.println(obj);
		
		// iterator
		Iterator it= obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}
