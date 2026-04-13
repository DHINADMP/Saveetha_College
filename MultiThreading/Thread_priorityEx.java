package MultiThreading;
class ExThread extends Thread {
	// Min pirority - 1
	// Normal pirority - 5
	// MAX pirority - 10
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Thread_priorityEx {
	public static void main(String[] args) {
		ExThread obj1=new ExThread();
		ExThread obj2=new ExThread();
		ExThread obj3=new ExThread();
		obj2.setPriority(Thread.MAX_PRIORITY);  // 3rd
		obj2.setPriority(Thread.NORM_PRIORITY); // 2st
		obj1.setPriority(Thread.MIN_PRIORITY); // 1 st
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
