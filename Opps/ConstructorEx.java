package Opps;

public class ConstructorEx {
			int a=10; // Global Variable
			int b=20;
	      ConstructorEx(int a,int b){ // Class
	    	  this.a=a; // setter 
	    	  this.b=b;
	     }
		 int Display() {
			System.out.println("This is Method");
			return 5+10; // getter
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  ConstructorEx obj=new ConstructorEx(20,40);
	  System.out.println(obj.a+obj.b);
	}
}
