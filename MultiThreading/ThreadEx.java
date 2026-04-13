package MultiThreading;
class SubClass1 extends Thread{ // Abstract Class
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
class SubClass2 extends Thread{
    public void run() {
    	char starts='A';
		for(int i=1;i<=5;i++) {
			System.out.println(starts);
			starts++;
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		SubClass1 obj1=new SubClass1();
		SubClass2 obj2=new SubClass2();
//		obj1.run();
//		obj2.run();
		obj1.start();
		obj2.start();

	}

}
