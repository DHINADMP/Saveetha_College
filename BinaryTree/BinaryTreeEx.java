package BinaryTree;

public class BinaryTreeEx {
	class Node{
		Node left;
		int data;
		Node right;
		Node(int data){
			this.left=null;
			this.data=data;
			this.right=right;
		}
	}
	Node root;
	BinaryTreeEx(int data){
		root=new Node(data);
	}
	
	void InsertLeft(Node root,int data) {
		root.left=new Node(data);
	}
	
	void InsertRight(Node root,int data) {
		root.right=new Node(data);
	}
	
	void InOrder(Node root) {
		if(root==null) {
			return;
		}
		InOrder(root.left);
		System.out.print(root.data +" ");
		InOrder(root.right);
	}
	
	void PreOrder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		PreOrder(root.left);
		PreOrder(root.right);
	}
	
	void PostOrder(Node root) {
		if(root==null) {
			return;
		}
		InOrder(root.left);
		InOrder(root.right);
		System.out.print(root.data+ " ");
	}
}
