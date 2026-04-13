package GenericExample;
class Box<Value>{
	Value t;
	Box(Value data){
		this.t=data;
	}
}
public class Demo {
	public static void main(String[] args) {
		Box<Integer> obj=new Box(155);
		System.out.println(obj.t);
	}
}


// T t   -->Type
// E e    ->Element
// K      ->Key
// V      ->Value
// N      ->Number