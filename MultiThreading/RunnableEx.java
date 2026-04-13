package MultiThreading;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("This is Runnable Class Thread");
	}
    public void run1() {
    	System.out.println("This is MyRunnable method");
	}
	
}
public class RunnableEx {
	public static void main(String[] args) {
//		MyRunnable obj=new MyRunnable();
//		obj.run();
		Thread th=new Thread(new MyRunnable());
		th.start();
		MyRunnable obj=new MyRunnable();
		obj.run1();
	}

}
