package StreamEXamples;

import java.util.Arrays;
import java.util.List;

public class FilterEx {

	public static void main(String[] args) {
		List<Integer> obj=Arrays.asList(1,2,4,7,6,8,9,3);
		// 1. filter
		obj.stream().filter(n -> n%2==1).forEach(System.out::println);
		// 2. reduce
		int ans=obj.stream().reduce(0,(a,b)->a+b);
		System.out.println(ans);
		
		//int ans=obj.stream().reduce(0,Integer :: sum);
		//System.out.println(ans);
		
		// 3. count
		
	}

}
