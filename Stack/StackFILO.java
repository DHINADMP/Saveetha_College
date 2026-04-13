package Stack;
public class StackFILO {
	Node head=null;
		void push(int data) {
			Node NewNode=new Node(data);
			// 7 6
			if(head==null) {
				head=NewNode;
				return;
			}
			NewNode.next=head;
			head=NewNode;
		}
		void Display() {
			Node temp=head;
			if(head==null) {
				System.out.println("Your Stack is Empty");
				return;
			}
			System.out.println();
			while(temp !=null) {
				System.out.println("---");
				System.out.println("|"+temp.data+"|");
				temp=temp.next;
			}
		}
		int peek() {
			if(head==null) {
				System.out.println("Your Stack is Empty");
				return 0;
			}
			return head.data;
		}
		void pop() {
			if(head==null) {
				System.out.println("Your Stack is Empty");
				return;
			}
			System.out.println(head.data);
			head=head.next;
		}
	public static void main(String[] args) {
		StackFILO stack=new StackFILO();
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.push(9);
		stack.push(15);
		stack.Display();
		System.out.println("Top of Stack Element : "+stack.peek());
	    stack.pop();
	    stack.Display();
		System.out.println("Top of Stack Element : "+stack.peek());
	}

}
