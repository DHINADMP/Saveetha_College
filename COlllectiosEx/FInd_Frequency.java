package COlllectiosEx;
import java.util.HashMap;
public class FInd_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Apple is Good orange is Medium Apple is tasty ";
		HashMap<String ,Integer> freq=new HashMap< >();
		for(String word :name.split(" ")) {
			freq.put(word, freq.getOrDefault(word, 0) +1);
		}
		System.out.println(freq);
	}

}
