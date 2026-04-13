package MultiThreading;
class Cheef extends Thread {
    public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println("Preparing Food"+i);
		try {
		Thread.sleep(3000); // 1 second=1000
		}
		catch(Exception E) {
			
		}
	}
    }
}
public class SleepEx {
	public static void main(String[] args) {
//		Cheef obj=new Cheef();
//		obj.start();
		try {
			Thread.sleep(8000);
			System.out.println("Main Method is Started");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		new Cheef().start();
		new Cheef().start();
		try {
			Thread.sleep(5000);
			System.out.println("Main Method is Ended");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
