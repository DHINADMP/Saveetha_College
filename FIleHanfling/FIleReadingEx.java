package FIleHanfling;
import java.io.BufferedReader;
import java.io.FileReader;
public class FIleReadingEx {
	public static void main(String[] args) {
		try {
		BufferedReader fr=new BufferedReader(new FileReader("Student.txt"));
		String line;
		int i=1;
		while((line = fr.readLine())!=null) {
			System.out.println(i+".) "+line);
			i++;
		}
		fr.close();
		
		}
		catch(Exception E) {
			
		}
	}

}


