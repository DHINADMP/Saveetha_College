package COlllectiosEx;
import java.util.HashSet;
public class Find_CommonVlues {

	public static void main(String[] args) {
		int[] a= {1,3,5,4};
		int[] b= {2,4,3,6};
		HashSet obj=new HashSet();
		for(int z:a) {
			obj.add(z);
		}
		for(int z : b) {
			if(obj.contains(z)) {
				System.out.print(z+" ");
			}
		}
	}

}



//  [tea,eat,cat,ate,bat,tab] - input
//  [[tea,eat,ate],[cat],[bat,tab]] -output

