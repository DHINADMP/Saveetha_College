package Opps;

// Multilevel =2
class Principle{
	void Position() {
		System.out.println("he is head of the School");
	}
	void Perminison() {
		System.out.println("Perminison Granted...!");
	}
}
class VicePrinciple extends Principle{ 
void Duty() {
	System.out.println("he want to get permision Principle");
}
}
class Staff extends VicePrinciple{
void Work() {
	System.out.println("Staff's want to get permision VicePrinciple");
}
}
class Studets extends Staff{
void celebrations() {
	System.out.println("They are asking for Staff's");
}
}
public class MultilevelEx {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Studets obj=new Studets();
	obj.celebrations();
	obj.Work();
	obj.Duty();
	obj.Position();
	obj.Perminison();
	}
}
