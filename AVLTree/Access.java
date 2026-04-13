package AVLTree;
public class Access {
	public static void main(String[] args) {
		AVL_TreeEx Avl=new AVL_TreeEx();
		Avl.root=Avl.Insert(Avl.root, 6);
		Avl.root=Avl.Insert(Avl.root, 2);
		Avl.root=Avl.Insert(Avl.root, 1);
		Avl.root=Avl.Insert(Avl.root, 9);
		Avl.root=Avl.Insert(Avl.root, 5);
		Avl.root=Avl.Insert(Avl.root, 7);
		Avl.root=Avl.Insert(Avl.root, 8);
		Avl.root=Avl.Insert(Avl.root, 3);
		Avl.root=Avl.Insert(Avl.root, 4);
		Avl.Inorder(Avl.root);
	}

}
