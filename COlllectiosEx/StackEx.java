package COlllectiosEx;
import java.util.Stack;
public class StackEx {
	public static void main(String[] args) {
		Stack obj=new Stack();
		Stack obj2=new Stack();
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		System.out.println(obj);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		// Check and Remove the Top ELemet
		System.out.println(obj.peek());
		// Check the Top Element
		System.out.println(obj);
//		obj.addFirst(obj);
//		obj.addLast(obj);
		obj.get(1);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		obj.contains(5);
		obj.add(0, 6);
		obj.remove(0);
		//obj.clear();
		System.out.println(obj.clone());
		obj.isEmpty();
		//System.out.println(obj.reversed());
		while(!obj.isEmpty()) {
			System.out.print(obj.pop() +" ");
		}
		System.out.print(obj);
	}
}
