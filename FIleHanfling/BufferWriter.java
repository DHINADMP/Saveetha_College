package FIleHanfling;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class BufferWriter {

	public static void main(String[] args) {
		try {
		BufferedWriter bw=new BufferedWriter( new FileWriter("class.txt"));
		
		bw.append("I am in the Class");
		bw.close();
		}
		catch(Exception E){
			
		}
	}

}
