package StreamEXamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//class Employee{
//	String dep;
//	Employee(String dept){
//		this.dep=dept;
//	}
//}
public class Demo {
	public static void main(String[] args) {
	List<Employee> obj=Arrays.asList(new Employee("IT"),
			new Employee("CSE"),
			new Employee("AIDS"),
			new Employee("IT")
			);
	Map<String ,List<Employee>> list=obj.stream().collect(Collectors.groupingBy(e ->e.dep));
	System.out.println(list.keySet());
	}

}


// <>
