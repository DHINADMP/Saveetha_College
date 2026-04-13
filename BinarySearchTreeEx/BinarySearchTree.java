package BinarySearchTreeEx;
public class BinarySearchTree {
	class Node{
		Node left;
		int data;
		Node right;
		Node(int data){
			this.left=null;
			this.data=data;
			this.right=null;
		}
	}
	Node root;
	BinarySearchTree(int data){
		root=new Node(data);
	}
	
	void Insert(Node root,int data) {
		if(root.data>data) { // Left side Insert
			if(root.left==null) {
				root.left=new Node(data);
			}else {
				Insert(root.left,data);
			}	
		}else { // Right Side of Tree
			if(root.right==null) {
				root.right=new Node(data);
			}else {
				Insert(root.right,data);
			}
		}
	}
	
	void Inorder(Node root) {
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	// 6 3 5 10 1 8 4 7 9 
	void Search(Node root,int data) {
		if(root==null) {
			System.out.print("\nElement is not found "+data);
			return;
		}
		if(root.data==data) {
			System.out.print("\nElement is found "+data);
			return;
		}
		if(root.data>data) {
			Search(root.left,data);
		}else {
			Search(root.right,data);
		}
	}
	
	Node Delete(Node root,int data) {
		if(root==null) {
			return null;
		}
		// find the node
		if(root.data>data) { // Left Side of Tree
			root.left= Delete(root.left,data);
		}
		else if(root.data<data) { // right side of Tree
			root.right=Delete(root.right,data);
		}else {
			// NO child
			if(root.left==null && root.right==null) {
				return null;
			}
			// 1 Child
			else if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			// 2 child
			else {
				Node Successor=findMin(root.right);
				root.data=Successor.data;
				root.right= Delete(root.right,Successor.data);
			}
		}
		
		return root;
	}
	public static Node findMin(Node root) {
		while(root.left !=null) {
			root=root.left;
		}
		return root;
		
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
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}
}