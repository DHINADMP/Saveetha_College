package StreamEXamples;
import java.util.Arrays;
import java.util.List;
class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
}
public class Top_3Salary {
	public static void main(String[] args) {
		List<Employee> obj=Arrays.asList(new Employee("A",20000),
				new Employee("B",30000),
				new Employee("c",32000),
				new Employee("d",35000),
				new Employee("e",28000),
				new Employee("f",40000));
		obj.stream().sorted((e1,e2)->e2.salary-e1.salary).limit(3).
		forEach(e->System.out.println(e.name +"->"+e.salary));
	}
}




