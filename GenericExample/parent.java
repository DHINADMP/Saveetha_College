package GenericExample;
class child<K ,V>{
	K person1;
	V person2;
	void setName(K person1,V person2) {
		this.person1=person1;
		this.person2=person2;
	}
	K getName1() {
		return person1;
	}
	V getName2() {
		return person2;
	}
}
public class parent {
	public static void main(String[] args) {
		child<String,String> obj=new child();
		obj.setName("Ramesh","Shanmathi");
		obj.setName("Raghul","jothi");
		System.out.println(obj.person1);
		System.out.println(obj.person2);
	}
}
