package Batch25;

public class Static {
//         static { // no need to create a object
//        	 System.out.println("This is My static");
//         }
			static int a=20;// Global Variable
			static void Display() {
				System.out.println("This is My first"
						+ "Method");
			}
	public static void main(String[] args) {
//		System.out.println("This is My main Method");
		
		System.out.println(a);
		Display();
	}

}
