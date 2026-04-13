package StreamEXamples;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//3) Convert list into map // only data
// Map-Key Value Pair

// List - "Raju", "Suresh", "Ramesh"; 
// map<String, Integer> key=Raju-4 key=suresh-6 key=ramesh-6;
public class Conver_List_Map {
	public static void main(String[] args) {
	List<String> names=Arrays.asList("Raju", "Suresh", "Ramesh","Ajith");
	Map<String,Integer> obj=names.stream().collect(Collectors.
			toMap(name -> name,name -> name.length()));
       System.out.println(obj);
	}
}
// Mini Project  -> College Management System
   // requirements 
		// 1. Add Student 
		// 2  Add Courses
        // 3. view Student
		// 4. Search by using Student ID
        // 5. Delete 
        // 6. Exit

		// 1. Create one Student class -> Student name,id
         //1. Create one Course class ->  Add Courses - id,name
        // 2. College Management class -> all methods like 
                        //2. view Student
		                // 3. Search by using Student ID
                        // 4. Delete 
                        // 5. Exit
