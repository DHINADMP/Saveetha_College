package FIleHanfling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FIndFrequencey_File {

	public static void main(String[] args) throws Exception{
		BufferedReader obj=new BufferedReader(new FileReader("Student.txt"));
		Map<String,Integer> map=new HashMap<>();
		String line;
		while((line=obj.readLine())!=null) {
			String[] arr=line.split(" ");
			for(String word:arr) {
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		}
		obj.close();
		System.out.println(map);
//		int ans=0/6;
		System.out.println(6/0);
		
	}
}






















// Puzzle 

//   Cleverly, there are exactly twleve E's in this sentence.

// Which number, when written as a word, makes this true:
