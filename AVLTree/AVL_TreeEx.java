package AVLTree;
public class AVL_TreeEx {
	class Node{
		Node left;
		int data;
		Node right;
		int height;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
			this.height=1;
		}
	}
		Node root;
		Node Insert(Node root,int data) {
			if(root==null) {
				return new Node(data);
			}
			if(root.data>data) { // Insert form Left
				root.left=Insert(root.left,data);
			}
			else if(root.data<data) { // Insert from right
				root.right=Insert(root.right,data);
			}else {
				return root; // remove the Duplicate
			}
			
			root.height	=1+max(height(root.left),height(root.right));
			int balance = getBalance(root);
			
			// Your 4 Cases
			// case 1; LL- Right Rotation
			if(balance>1 && data<root.left.data ) {
				return RightRotation(root);
			}
			// Case 2: RR -> Left Rotation
			if(balance<-1 && data>root.right.data) {
				return LeftRotation(root);
			}
			// case 3: LR - 
			if(balance>1 && data>root.left.data) {
				root.left=LeftRotation(root.left);
				return RightRotation(root);
				
			}
			// case 4: RL
			if(balance<-1 && data<root.right.data) {
				root.right=RightRotation(root.right);
				return LeftRotation(root);
				
			}
			return root;
		}
		Node RightRotation(Node X) {
			Node y=X.left;
			Node t=y.right;
			y.right=X;
			X.left=t;
			X.height =1+max(height(X.left),height(y.right)+1);
			y.height=1+max(height(y.left),height(X.right)+1);
		
			return y;
		}
		Node LeftRotation(Node X) {
			Node y=X.right;
			Node t=y.left;
			y.left =X;
			X.right =t;
			X.height =1+max(height(X.left),height(y.right));
			y.height=1+max(height(y.left),height(X.right));
			return y;
		}
		public int getBalance(Node root) {
			if(root==null) {
				return 0;
			}
			return height(root.left)-height(root.right); // {-2,-1,0,1,2}
		}
		public int height(Node N) {
			if(N==null) {
				return 0;
			}
			return N.height;
		}
		public int max(int a, int b) {
			return (a>b)?a:b;
		}	
		void Inorder(Node root) {
			if(root==null) {
				return;
			}
			Inorder(root.left);
			System.out.print(root.data +" ");
			Inorder(root.right);
		}
}
