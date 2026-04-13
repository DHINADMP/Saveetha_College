package StreamEXamples;
import java.util.Arrays;
import java.util.List;
public class Ss_EvenNumbers {
      // sum of squre of Eeven Numbers
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 2 3 4 5 6
//		4
//	   16
//	   36
//	   56
		List<Integer> obj=Arrays.asList(1,2,3,4,5,6);
		int sum =obj.stream().filter(n->n%2==0).map(n->n*n).
				reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}
// Top 3 Highest Paid Employees