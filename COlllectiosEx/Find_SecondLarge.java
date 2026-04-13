package COlllectiosEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Find_SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(Arrays.asList(34,52,13,54,57,28,68,42));
		Collections.sort(list);
		System.out.println("Second Largest "+list.get(list.size()-2));
		Collections.reverse(list);
		System.out.println(list);
	}

}
