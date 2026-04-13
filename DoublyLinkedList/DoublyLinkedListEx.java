package DoublyLinkedList;

public class DoublyLinkedListEx {
		Node head=null;
		Node tail=null;
		void InsertAtBegining(int data) {
			Node NewNode=new Node(data);
			if(head==null && tail==null) { //1 2
				head=NewNode;
				tail=NewNode;
				return;
			}
			head.prev=NewNode;
			NewNode.next=head;
			head=NewNode;
		}
		void Display() {
			Node temp=head;
			System.out.print("null");
			while(temp !=null) {
				System.out.print("<-"+temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println("");
		}
		void Reverse() {
			Node temp=tail;
			System.out.print("null");
			while(temp !=null) {
				System.out.print("<-"+temp.data+"->");
				temp=temp.prev;
			}
			System.out.print("null");
			
			System.out.println("");
		}
		void InsertAtLast(int data) {
			if(head==null && tail==null) {
				InsertAtBegining(data);
				return;
			}
			Node NewNode=new Node(data);
			NewNode.prev=tail;
			tail.next=NewNode;
			tail=NewNode;
		}
		// null<-1-><-2-><-3-><-4-><-2-><-3-><-5-> 6 null
		void InsertAtIndex(int index,int data) {  // index = 4
			Node NewNode =new Node(data);
			if(index==0) {
				InsertAtBegining(data);
				return;
			}
			Node temp=head;
			for(int i=0;i<index-1;i++) {
				temp =temp.next;
			}
			if(temp.next==null) {
				InsertAtLast(data);
				return;
			}
			NewNode.next=temp.next;
			temp.next.prev=NewNode;
			NewNode.prev=temp;
			temp.next=NewNode;
			
		}
		
		void DeleteFirst() {
			if(head==null && tail==null) {
				System.out.println("Your Doubly Linked List is Empty");
				return;
			}
			if(head==tail) {
				head=null;
				tail=null;
				return;
			}
			head=head.next;
			head.prev=null;
		}
		
		void DeleteIndex(int index) {
			if(head==null && tail==null) {
				System.out.println("Your Doubly Linked List is Empty");
				return;
			}
			// null<-3-><-4-><-2-><-3-><-5->null
			//  
			if(index==0) {
				DeleteFirst();
				return;
			}
			Node temp=head;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			
			temp.next=temp.next.next;
			if(temp.next==null) {
				return;
			}
			temp.next.next.prev=temp;
		}
		
		boolean DeleteElement(int data) {
			if(head.data==data) {
				DeleteFirst();
				return true;
			}
			Node temp=head;
			while(temp.next !=null &&temp.next.data !=data) {
				temp=temp.next;
			}
			if(temp.next==null) {
				return false;
			}
			temp.next=temp.next.next;
			if(temp.next==null || temp.next.next==null) {
				return true;
			}
			temp.next.next.prev=temp;
			return true;
		}
		void DeleteLast() {
			if(head==null && tail==null) {
				System.out.println("Your Doubly Linked List is Empty");
				return;
			}
			if(head==tail) {
				head=null;
				tail=null;
				return;
			}
			tail=tail.prev;
			tail.next=null;
		}
		
	public static void main(String[] args) {
		DoublyLinkedListEx dll=new DoublyLinkedListEx();
		dll.InsertAtBegining(4);
		dll.InsertAtBegining(3);
		dll.InsertAtBegining(2);
		dll.InsertAtBegining(1);
		dll.InsertAtLast(3);
		dll.InsertAtLast(5);
		dll.InsertAtIndex(4,2);
		dll.InsertAtIndex(7,7);
		dll.InsertAtIndex(7,6);
		dll.DeleteFirst();
		dll.DeleteIndex(0);
		if(!dll.DeleteElement(3)) {
			System.out.println("Element is Not Presented your Linked List");
		}
		if(!dll.DeleteElement(7)) {
			System.out.println("Element is Not Presented your Linked List");
		}
		if(!dll.DeleteElement(5)) {
			System.out.println("Element is Not Presented your Linked List");
		}
		dll.Display();
		// dll.Reverse();
	}
}






















