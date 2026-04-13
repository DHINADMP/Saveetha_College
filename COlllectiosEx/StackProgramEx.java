package COlllectiosEx;
import java.util.Stack;
public class StackProgramEx {
	public static void main(String[] args) {
		Stack Forward=new Stack();
		Stack Backward=new Stack();
		String current="Chrome Browser";
		Backward.push(current);
		current="FaceBook";
		Backward.push(current);
		current="Nagivate to Youtube";
		Backward.push(current);
		Forward.push(Backward.pop());
		Forward.push(Backward.pop());
		current=(String)Backward.peek();
		System.out.println(current);
	}
}
