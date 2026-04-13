package Batch25;
import java.util.Scanner;
public class Frequency_Array {

	public static void main(String[] args) {
		// 0 1 2 ... 127
		// f d a f d s f h
		// f d a s h
		// f->3, d->2,a->1,s->1,h->1,
		// f,d,
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		char[] arr=new char[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.next().charAt(0);
		}
		int[] freq=new int[128];
		for(int i=0;i<len;i++) {
			freq[arr[i]]++;
		}
		// d f f d s e g f d
		for(int i=0;i<128;i++) {
			if(freq[i]>=1) {
				System.out.println((char)i+"->"+freq[i]);
//				System.out.print((char)i+" ");
			}
		}

	}

}


// 1 0 2 4 0 5 0
// 1 2 4 5 0 0 0 





