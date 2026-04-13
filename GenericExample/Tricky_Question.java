package GenericExample;
import java.util.ArrayList;
import java.util.List;
public class Tricky_Question {
	public static void AddNumber(List< ? super Integer> list ){
		list.add(20); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj=new ArrayList();
		AddNumber(obj);
		System.out.println(obj);
	}

}
