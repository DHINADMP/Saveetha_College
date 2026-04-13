package Lambda;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class COllectionsEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj= Arrays.asList(7,5, 8,9,2 ,3);
		obj.sort((a,b)-> a - b);
		System.out.println(obj);
		obj.forEach(x->System.out.print(x+" "));
	}

}
