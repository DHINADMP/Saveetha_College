package COlllectiosEx;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class List_Rotation {

	public static void main(String[] args) {	
		ArrayList obj=new ArrayList(Arrays.asList(1,2,3,4,5));
		int k=2;
		Collections.rotate(obj, k);
		System.out.println(obj);
	}
}
