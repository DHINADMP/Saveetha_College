package Opps;
// 1-Overloading-Running Compile time Running
// 2-Overriding -Running on RunTime

public class PolumorphismEx {
		void Addition(int a,int b) { // Arguments
			System.out.println(a+b);
		}
		void Addition(int a,int b,int c) {
			System.out.println(a+b+c);
		}
		void Addition(int a,int b,int c,int d) {
			System.out.println(a+b+c+d);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolumorphismEx obj=new PolumorphismEx();
		obj.Addition(7, 5);// parameters
		obj.Addition(7, 5, 6 );
		obj.Addition(7, 5, 6, 8);
	}

}
