package Batch25;

public class VariablesEx {
		static int a=10;// Global Variable
	public static void main(String[] args) {
		 int b=20; // Local Variable
		//System.out.println(b);
		{
			{
				int c=30; // Block Variable
				//System.out.println(c);
			}
		}
		int i=0;
		for(i=0;i<5;i++) {
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println(i);
	}
}


// Gloabl- access anywhere in the class
// Local - access within the main mathods
// Bolck - within the Block only