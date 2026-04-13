package Opps;
// Abstract -> Hiding of unused informations

abstract class Bike{
	void driving() {
		System.out.println("i am Driving the bike");
	}
	abstract void service();
}
class ServiceCenter extends Bike{
	@Override
	void service() {
		System.out.println("Your bike is ready to Ride..!");
	}
}

class service2 extends Bike{

	@Override
	void service() {
		
	}
	
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceCenter obj=new ServiceCenter();
		obj.driving();
		obj.driving();
		obj.driving();
		obj.service();
		obj.driving();
		obj.driving();
		obj.service();
	}

}
