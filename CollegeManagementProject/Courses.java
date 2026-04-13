package CollegeManagementProject;

public class Courses {
	int courseId;
	String CourseName;
	Courses(int courseId,String CourseName){
		this.courseId=courseId;
		this.CourseName=CourseName;
	}
	void Display() {
		System.out.println("Course Id -> "+courseId+
				" Course Name -> "+CourseName);
	}
}
