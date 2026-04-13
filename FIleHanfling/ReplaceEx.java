package FIleHanfling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class ReplaceEx {
	public static void main(String[] args) throws Exception{
		File obj=new File("text.txt");
	BufferedReader br=new BufferedReader(new FileReader(obj));
	StringBuilder vlaue=new StringBuilder();
	String line;
	while((line=br.readLine())!=null) {
		// Replace the Words
		line =line.replace("Java", "Python");
		vlaue.append(line).append("\n");
	}
	br.close();
	// Update the new Content Value again in your File
	BufferedWriter bw=new BufferedWriter(new FileWriter("text.txt"));
	bw.write(vlaue.toString());
	bw.close();
	System.out.println("file is Updated....!!!");
	}
}
