package StreamEXamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//class Employee{
//	int salary;
//	Employee(int salary){
//		this.salary=salary;
//	}
//}
public class Company {
	public static void main(String[] args) {
		List<Employee> obj=Arrays.asList(new Employee(2000),
				new Employee(3000),new Employee(45000),
				new Employee(50000));
		long count=obj.stream().filter(e -> e.salary <=3000).count();
		System.out.println(count);
	}
}
