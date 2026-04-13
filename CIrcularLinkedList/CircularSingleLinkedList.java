package CIrcularLinkedList;

public class CircularSingleLinkedList<T> {
	class Node{
		T data;
		Node next;
		Node(T data){
			this.data=data;
			this.next=next;
		}
	}
	Node head=null;
	void InsertAtBegining(T data) {
		Node NewNode=new Node(data);
		if(head==null) {
			NewNode.next=NewNode;
			head=NewNode;
		}else {
			NewNode.next=head.next;
			head.next=NewNode;	
		}
	}
	
	void Display() {
		Node temp=head;
		if(temp==null) {
			System.out.println("I Dont have any"
					+ "Value in your Circular Linked List");
			return;
		}
		do {
			System.out.print("<-"+temp.data+"->");
			temp=temp.next;
		}while(temp !=head);
		
	}
	// <-6-><-3-><-4->5->
	void InsertAtLast(T data) {
		Node NewNode=new Node(data);
		if(head==null) {
			InsertAtBegining(data);
			return;
		}
		NewNode.next=head.next;
		head.next=NewNode;
		head=NewNode;
	}
	void DeleteFirst() {
		if(head==null) {
			System.out.println("You Cant Delete");
			return;
		}
		if(head.next==head) {
			head=null;
			return;
		}
		head.next=head.next.next;
	}
	
	void DeleteLast() {
		if(head==null) {
			System.out.println("You Cant Delete");
			return;
		}
		if(head.next==head) {
			head=null;
			return;
		}
		Node temp=head;
		while(temp.next !=head) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		head=temp;
	}

	public static void main(String[] args) {
		
	CircularSingleLinkedList<Integer> cll=new CircularSingleLinkedList();
		cll.InsertAtBegining(5);
		cll.InsertAtBegining(4);
		cll.InsertAtBegining(3);
		cll.InsertAtLast(6);
		cll.InsertAtLast(7);
		cll.DeleteFirst();
		cll.DeleteLast();
		cll.Display();	
	}

}




































