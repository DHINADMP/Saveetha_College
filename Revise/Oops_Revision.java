package Revise;
//class Person{
//	void HomeWork(int a) {
//		System.out.println("He is Doing HomeWork");
//		System.out.println("He is Finished "+a+" Homeworks");
     // return-> Getter
//	}
//}

class SetValues{
	int Age;
	String name;
	SetValues(int Age,String name){
		this.Age=Age; // Setter
		this.name=name;
	}
}

public class Oops_Revision {

	public static void main(String[] args) {
//		Person obj=new Person();
//		obj.HomeWork(2);
		
		SetValues obj=new SetValues(23,"Raghul");
		System.out.println(obj.Age);
		System.out.println(obj.name);
		
//	1) Single Inheritance
//	2) Multilevel
//	3) multiple -> one child and Multiple Parent
// 	so, we cant abele to achive on Inheritance
// using Interface class We can able to Achieve this
//	4) hybrid
//	5) hyrarerical -> one parent Multiple Child
	
	   //1 One Parent class // parent
	// method Work();
//	          extends
	   //2 One Parent class // child // Parent
	// method Work();
//    			extends
	   //3 One Parent class // child // Parent
	// method Work();
//				extends
// 			one child class // child
	// Super Key Word
	// method Work();
//	   super.work();
	
	   //1 One Parent class // parent
				//    extends
//		1 One child Extends Parent class // child 
//					
//		2 Child Extends Parent // child 
//					
//		3 child Extends Parent // child	
	
	
// Hybrid inheritance-> Combining more 2 Inheritance
	
// 2) Polymorphism
	
	// OverLoading -Compile time Polymorphism
	// one with we achieve in same methods name in
	// passsing the different Paramaters on method
	// OverRiding  - Run Time Polymorphism
	// using Multileve Inheritance at Overriding the
	// Methods we can Achieve duplicate the Method Name
	
// Encapsulation -> Binding of Informations;
// Main Formet Specifiers
//		1) public-we can able to Access Anywhere in the Program
// 		2) private- can Access only within the Same Class
//      3) Protected- we can Access only Within a Package
// 		4) default- we can Access only Within a Package
//      5) private,Protected
// 4) Abstraction -> Hiding unsed or unWanted Data, Only it will showing
	// Useful or wanted Data's
	
	// abstract class{
	// abstract void display();
	// it dosen't have a body
//	  void add() {
//		  
//	  }
//    }
	// child class extends this abstract{
	//@Overiding
//	void display() {
//		// Statement
//	}
	
// Interface -> we can Acheive multiple Inheritance;
		// Interface class parent1
		  // any method your creaing the Interface class
		 // abstract methods only
		// expect Static and Default Methods
		// Interface class parent2
		// Interface class parent3
		
		// child implements parent1,parent2,parent3{
	   // Must your want to override the all Parent class methods
		//  expect Static and Default Methods
//    	}	
//    final Key Work
//    we can't able to Change or Update
//		1) Final Class
//	 you can't able to Extends or Implement with any other classes
//		2) Final Method
//	you can't able to Override or overloading this method
//		3) Final Variable
//  you can't able to acess for Compound assignment -> =		
	}
}

















