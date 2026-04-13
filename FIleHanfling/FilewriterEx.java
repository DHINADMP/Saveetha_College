package FIleHanfling;
import java.io.FileWriter;
public class FilewriterEx {
	public static void main(String[] args) {
		try {
		FileWriter fl=new FileWriter("text.txt",true);
		// it's not deleting the old Values, Updatet the Values
		fl.write("\ni am Teaching an Java");
		fl.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("File Writing is SucessFull...!!!");
	}

}
