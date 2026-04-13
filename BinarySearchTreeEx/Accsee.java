package BinarySearchTreeEx;
public class Accsee {
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree(6);
		bst.Insert(bst.root,3);
		bst.Insert(bst.root,5);
		bst.Insert(bst.root,10);
		bst.Insert(bst.root,1);
		bst.Insert(bst.root,8);
		bst.Insert(bst.root,4);
		bst.Insert(bst.root,7);
		bst.Insert(bst.root,9);
		//bst.Inorder(bst.root);
		//bst.Search(bst.root, 15);
		// bst.Delete(bst.root, 3);
		System.out.println("This is InOrder Traversal");
		bst.Inorder(bst.root);
		System.out.println();
		
		System.out.println("This is PreOrder Traversal");
		bst.PreOrder(bst.root);
		System.out.println();
		
		System.out.println("This is PostOrder Traversal");
		bst.PostOrder(bst.root);
		System.out.println();
		// 1 2 
	}
}
