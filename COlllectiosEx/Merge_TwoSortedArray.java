package COlllectiosEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge_TwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 4 7 9 11
		// 1 3 5 8 10
		// 1 2 3 4 5 7 8 9 10 11
		List obj1= Arrays.asList(2,4,7,9,11);
		List obj2= Arrays.asList(1,3,5,8,10);
		List result=new ArrayList();
		result.addAll(obj1);
		result.addAll(obj2);
		Collections.sort(result);
		System.out.println(result);
	}

}
