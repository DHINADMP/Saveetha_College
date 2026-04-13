package MultiThreading;
class Cooking {
	int count=0; //+1
	synchronized void increment ()throws Exception {
		count++;
		Thread.sleep(1000);
	}
}
public class SynchronizationEx {

	public static void main(String[] args) throws Exception{
		Cooking c=new Cooking();
		Thread cheef1=new Thread(()->{
			for(int i=1;i<=20;i++) {
				try {
					c.increment();
				} catch (Exception e) {
				}
			}
		});
		Thread cheef2=new Thread(()->{
			for(int i=1;i<=20;i++) {
				try {
					c.increment();
				} catch (Exception e) {

				}
			}
		});
		cheef1.start();
		cheef2.start();
		System.out.println(c.count);
		cheef1.join();
		cheef2.join();
		System.out.println(c.count);
	}

}
