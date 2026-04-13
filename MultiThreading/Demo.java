package MultiThreading;

public class Demo {
		void DisplayNum() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		}
		void DisplayChar() {
			char starts='A';
			for(int i=1;i<=5;i++) {
				System.out.println(starts);
				starts++;
			}
		}
	public static void main(String[] args) { // main Person
		Demo obj=new Demo();
		obj.DisplayNum();// subPerson 1
		obj.DisplayChar(); // subPerson2
	}

}

// It can able to Excuting multiple Threads Simultaneously
// 
