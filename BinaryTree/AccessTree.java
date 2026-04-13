package BinaryTree;
public class AccessTree {
	public static void main(String[] args) {
		BinaryTreeEx bt=new BinaryTreeEx(5);
		bt.InsertLeft(bt.root, 3);
		bt.InsertRight(bt.root, 6);
		bt.InsertLeft(bt.root.left, 1);
		bt.InsertRight(bt.root.left, 4);
		bt.InsertLeft(bt.root.right, 7);
		bt.InsertRight(bt.root.right, 8);
		bt.InOrder(bt.root);
		System.out.println();
		bt.PreOrder(bt.root);
		System.out.println();
		bt.PostOrder(bt.root);
	}

}
