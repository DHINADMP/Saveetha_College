package GenericExample;

public class Generic_Method {
	public static<T> void print(T data) {
		System.out.println(data);
	}
	public static void main(String[] args) {
		print(45);
		print("This is My Class");
		print('D');
	}
}
