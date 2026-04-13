package FIleHanfling;
import java.io.File;
import java.io.FileWriter;
public class Demo {
	public static void main(String[] args) {
		// File-> Crate,delete,Update,read,
		File fl=new File("JavaNotes.txt");
		// with will achieve only one work at a time
		try {
		if(fl.createNewFile()) {
			System.out.println("File Create "+fl.getName());
		}else {
			System.out.println("File is alreday Created");
		}
		}
		catch(Exception e) {
			
		}
	}

}
