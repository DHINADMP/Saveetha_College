package Batch25;
import java.util.HashMap;
import java.util.Scanner;
public class Pattern_Matching {
		static boolean CheckPattern_Matching(String pattern,String str ) {
			String[] words=str.split(" ");
			if(words.length !=pattern.length()) {
				return false;
			}
			HashMap<Character,String> map1=new HashMap<>();
			HashMap<String,Character> map2=new HashMap<>();
			
			for(int i=0;i<words.length;i++) {
				
				char ch=pattern.charAt(i);
				String word=words[i];
				// Map1 -> Word(Value)
				if(map1.containsKey(ch)) {
					if(!map1.get(ch).equals(word)) {
						return false;
					}
				}else {
					map1.put(ch, word);
				}
				
				// Map2 -> ch(Key)
				if(map2.containsKey(word)) {
					if(map2.get(word) !=ch) {
						return false;
					}
				}else {
					map2.put(word, ch);
				}
			}
			return true;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		String pattern=sc.nextLine(); // abab
		String str=sc.nextLine(); // cat dog cat dog
		boolean result=CheckPattern_Matching(pattern,str);
		System.out.println(result);
		if(result) {
			System.out.println("Its Matching");
		}else {
			System.out.println("Its not Matching");
		}
	}
}
