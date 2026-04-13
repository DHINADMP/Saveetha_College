package COlllectiosEx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"tea","eat","cat","ate","bat","tab"};
		HashMap<String,List <String>> obj=new HashMap<>();
		for(String word:name) {
			char[] ch=word.toCharArray();
			Arrays.sort(ch);
			String Key=new String(ch);
			obj.putIfAbsent(Key, new ArrayList<>());
			obj.get(Key).add(word);
		}
		System.out.println(obj);
	}

}

// stack and Queue..

// stack-LIFO FILO
// Queue - FIFO
