package COlllectiosEx;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {

	public static void main(String[] args) {
		Queue obj=new LinkedList();//Dynamic Bounding
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj.peek()); // Top Element
		System.out.println(obj);
		System.out.println(obj.poll()); // Top Element
		System.out.println(obj);
		obj.poll();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains(3));
//		System.out.println(obj.removeAll(obj));
//		System.out.println(obj.removeAll(obj));
		System.out.println(obj.size());
		System.out.println(obj);
		Iterator it=obj.iterator();
		while(it.hasNext()) { //->null
			System.out.print(it.next()+" ");
		}
	}
}















