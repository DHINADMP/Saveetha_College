package LinkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class SingleLinkedList {
	Node head=null;
	void InsertAtBegining(int data) {
		 //1-> 2->10->4->7->10->null
		Node NewNode=new Node(data);
		if(head==null) {
			head=NewNode;
			return;
		}
		NewNode.next=head;
		head=NewNode;
	}
	void InsertAtLast(int data) {
		Node NewNode=new Node(data); // 2 5 6 7-null 
		if(head==null) {
			InsertAtBegining(data);
			return;
		}
		Node temp=head;
		while(temp.next !=null) {
			temp =temp.next;
		}
		temp.next=NewNode;
	}
	void Display() {
		Node temp=head;
		System.out.println();
		while(temp !=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	void InsertAtIndex(int index,int data) {
		Node NewNode=new Node(data);
		// -5->1->2->10-> 5  4->7->10->null
		if(head==null || index==0) { // 4
			InsertAtBegining(data);
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		NewNode.next=temp.next;
		temp.next=NewNode;
	}
	void DeleteFist() {
		if(head==null) {
			System.out.println("Your Linked List is Empty");
			return;
		}
		head=head.next;
	}
	void DeleteLast() {
			if(head==null) {
				System.out.println("Your Linked List is Empty");
				return;
			}
			Node temp=head;
			while(temp.next.next !=null) {
				temp=temp.next;
			}
			temp.next=null;
	}
	void DeleteAtIndex(int index) {
		if(head==null) {
			System.out.println("Your Linked List is Empty");
			return;
		}
		else if(index==0) {
			DeleteFist();
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	void DeleteElement(int data) {
		if(head==null) {
			System.out.println("Your Linked List is Empty");
			return;
		}
		if(head.data==data) {
			DeleteFist();
			return;
		}
		Node temp=head;
		while(temp.next !=null && temp.next.data !=data) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	boolean search(int data) {
		Node temp=head;
		if(head==null) {
			System.out.println("Your Linked List is Empty");
			return false;
		}
		while(temp !=null) {
			if(temp.data==data) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	void reverse() {
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current !=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	public static void main(String[] args) {
		SingleLinkedList sll=new SingleLinkedList();
//		sll.InsertAtLast(2);
//		sll.InsertAtLast(10);
//		sll.InsertAtLast(4);
//		sll.InsertAtLast(7);
//		sll.InsertAtLast(10);
//		sll.InsertAtBegining(1);
//		sll.InsertAtBegining(-5);
//		sll.InsertAtIndex(0,-10);
//		sll.InsertAtIndex(4,25);
//		sll.InsertAtIndex(8,67);
//		sll.InsertAtIndex(10,100);
//		sll.DeleteFist();
//		sll.DeleteFist();
//		sll.DeleteLast();
//		sll.DeleteLast();
//		sll.DeleteLast();
//		sll.DeleteAtIndex(0);
//		sll.DeleteAtIndex(4);
//		sll.DeleteElement(2);
//		sll.Display();
//		if(sll.search(4)) {
//			System.out.println("Element is Found");
//		}else {
//			System.out.println("Element is not Found");
//		}
		
		sll.InsertAtBegining(1);
		sll.InsertAtLast(2);
		sll.InsertAtLast(3);
		sll.InsertAtLast(4);
		sll.InsertAtLast(5);
		sll.Display();
		sll.reverse();
		sll.Display();
		
	}
}


