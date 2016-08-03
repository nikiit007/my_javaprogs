package geeks_for_geeks.trees;
import java.io.*;

public class Traversals 
{

	public static void main(String[] args) throws IOException
	{
		Node root=new Node(1);
		root.left= new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		//Binary_tree bt=new Binary_tree(root);
		/*Binary_tree.preorder(root);
		System.out.println();
		*/
		Binary_tree.inorder(root);
		System.out.println();
		Binary_tree.inorder_stack(root);
		System.out.println();
		/*
		Binary_tree.postorder(root);
		System.out.println();
		Binary_tree.printlevellorder(root);
*/
	}

}
