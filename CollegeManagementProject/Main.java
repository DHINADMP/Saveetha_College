package CollegeManagementProject;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Student> students=new ArrayList<>();
	static ArrayList<Courses> course=new ArrayList<>();
	 static void addStudent() {
		 System.out.println("Enter the Student ID");
		 int Id=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the Student Name");
		 String Name=sc.nextLine();
		 
		 students.add(new Student(Id,Name));
		 System.out.println("Student Information Added SucessFull...!!!");
	 }
	 
	 static void addCourse() {
		 System.out.println("Enter the Course ID");
		 int CourseId=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter the Course Name");
		 String CourseName=sc.nextLine();
		 course.add(new Courses(CourseId,CourseName)) ;
		 System.out.println("Courses Added SucessFull...!!!");
	 }
	 
	 static void ViewStudent() {
		 for(Student s:students) {
			 s.Display();	
		 }
	 }
	 
	 static void ViewCourse() {
		 for(Courses c:course) {
			 c.Display();
		 }
	 }
	 
	 static void DeleteStudent() {
		 System.out.println("Enter the Student ID");
		 int id=sc.nextInt();
		boolean remove= students.removeIf(s->s.id== id);
		 if(remove) {
		 System.out.println("Stdent DataBase Deleted....!!!");
		 }else {
			 System.out.println("Stdent DataBase not  Deleted....!!!");
		 }
	 }
	 
	 
	public static void main(String[] args) {
		while(true) {
			System.out.println("====== College Management System ======");
			System.out.println("1. Add Student");
			System.out.println("2  Add Courses");
			System.out.println("3  View Student");
			System.out.println("4  View Courses");
			System.out.println("5  Delete Student");
			System.out.println("6  Exit");
			
			System.out.println("Plz Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				addStudent();
				break;
			}
			case 2:{
				addCourse();
				break;
			}	
			case 3:{
				ViewStudent();
				break;
			}	
			case 4:{
				ViewCourse();
				break;
			}	
			case 5:{
				DeleteStudent();
				break;
			}	
			case 6:{
				System.exit(0);
			
			}
			default :{
				System.out.println("Enter the Correct CHoice");
			}
		  }
		}
	}

}













































