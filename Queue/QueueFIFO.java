package Queue;
public class QueueFIFO {
		Node head=null;
		Node tail=null;
		void Enqueue(int data) {
			Node NewNode=new Node(data);
			if(head==null && tail==null) {
				head=NewNode;
				tail=NewNode;
				return;
			}
			tail.next=NewNode;
			tail=NewNode;
		}
		void Display() {
			Node temp=head;
			while(temp !=null) {
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
		int peek() {
			if(head==null) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return head.data;
		}
		void Dequeue() {
			if(head==null) {
				System.out.println("Queue is Empty");
				return;
			}
			if(head==tail) {
				head=null;
				tail=null;
				return;
			}
			head=head.next;
		}
	public static void main(String[] args) {
		QueueFIFO queue=new QueueFIFO();
		queue.Enqueue(1);
		queue.Enqueue(2);
		queue.Enqueue(3);
		queue.Enqueue(4);
		queue.Enqueue(5);
		queue.Display();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Display();
		queue.Enqueue(11);
		queue.Enqueue(24);
		queue.Enqueue(13);
		queue.Enqueue(45);
		queue.Enqueue(52);
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Dequeue();
		queue.Display();
		System.out.println(queue.peek());
		
	}

}




















