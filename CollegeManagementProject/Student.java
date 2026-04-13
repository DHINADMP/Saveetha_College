package CollegeManagementProject;

public class Student {
		int id;
		String name;
		Student(int id,String name){
			this.id=id;
			this.name=name;
		}
	void Display() {
		System.out.println("ID ->"+id+" name -> "+name);
	}
}
