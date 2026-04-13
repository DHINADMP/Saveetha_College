package COlllectiosEx;
import java.util.Stack;
public class Check_ValidParanthesis {
	 static boolean isValid(String value) {
		 Stack obj=new Stack();
		 for(char ch:value.toCharArray()) {
			 if(ch=='('||ch=='['||ch=='{') {
				 obj.push(ch);
			 }else {
				 if(obj.isEmpty()) {
				   return false;	 
				 }	 
				 char top=(char)obj.pop();
				 if((ch==')' && top !='(')||  
				 (ch==']' && top !='[') ||
				( ch=='}' && top !='{')){
					 return false;
				 }
			}
		}
		return obj.isEmpty(); 
	 }
	public static void main(String[] args) {
		// ( [ ] ) == true
		// [ ()  }   == false 
		String value=")]}";
		System.out.println(isValid(value));
	}
}


