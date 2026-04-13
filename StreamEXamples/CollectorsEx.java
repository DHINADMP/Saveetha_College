package StreamEXamples;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class students{
	int id;
	students(int id){
		this.id=id;
	}
}
public class CollectorsEx {

	public static void main(String[] args) {
	  List<Integer> student=Arrays.asList(1,2,3, 7, 9, 4);
	  List<students> obj=student.stream().map(students :: new).collect(Collectors.toList());
	  System.out.println(obj.size()); // 5
	  
	  
	  obj.forEach(System.out::println);
	  System.out.println(obj);
//	  students s=new students(3);
//	  System.out.println(s.id);
//	  for(int s :obj) {
//		  System.out.println(s);x	
//	  }
	  
	}

}
