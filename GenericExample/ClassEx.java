package GenericExample;
import java.util.Scanner;
public class ClassEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer obj=new Integer(7557675);
		Character letter=new Character('D');
		Integer a=new Integer(45);// Object
		int b=75576;// separate index
		int copy=letter;
		char d='A';
		String name=new String("Class");
		String n="Class";
		System.out.println(letter.getClass());
		ClassEx obj2=new ClassEx();
		System.out.println(obj2.getClass());
	}

}
