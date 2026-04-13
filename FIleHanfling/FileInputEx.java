package FIleHanfling;
import java.io.FileWriter;
import java.util.Scanner;
public class FileInputEx {
	public static void main(String[] args) throws Exception{
		FileWriter obj=new FileWriter("Student.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the How Many Numbers to Add the DataBase");
		int i=1;
		int database=sc.nextInt();
		sc.nextLine();
		while(i<=database) {
		System.out.println("Enter the Student Name for "+i);
		String name=sc.nextLine();
		System.out.println();
		System.out.println("Enter the Student Age for "+i);
		int age=sc.nextInt();
		System.out.println();
		sc.nextLine();
		System.out.println("Enter the Student Address for "+i);
		String Address=sc.nextLine();
		obj.write("Name : "+name+"\t Age : "+age+"\tAddress : "+Address +"\n");
		i++;	
		}
		obj.close();
	}

}
