package Batch25;
public class MethodsEx {
	// type-1
//		void Display(){
//			System.out.println("This is my first"
//					+ "Method");	
//		}
//	// type -2
//		String robot() { // Methods Creation
//			return "Completed Preparation..!";
//		}
//		// type -3
//		void robot(int tea,int juice) { //getting arguments
//			System.out.println("Preparing for Tea "+ tea+" cups");
//			System.out.println("Preparing for juice "+juice+" cups");
//		}
		// type -4
//		int robot(int tea,int juice) { //getting arguments
//			System.out.println("Preparing for Tea "+ tea+" cups");
//			System.out.println("Preparing for juice "+juice+" cups");
//			return tea+juice;
//		}
//		static void Display() {
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//			System.out.println("Hello");
//		}
	static int addition() {
		if(6==5) {
			return 0;
		}else {
		return 7+8;
		}
		
	}
	public static void main(String[] args) {
	//	nextInt()// pre define
	// no return and no parameters ->1
	// with return and no parameters ->2
	// no return and with parameters ->3
	// with return and with parameters ->4
//		MethodsEx obj=new MethodsEx();
//		obj.Display();
//		//String ans=obj.robot();// method Calling
//		//System.out.println(ans);
//		int cups=obj.robot(2,2);// passing Parameters
//		System.out.println("Robot will returns "+cups+" cups");
//		System.out.println("this is Main Method");
//		Display();
//		Display();
//		Display();// reuse 
		System.out.println(addition());
	}

}
