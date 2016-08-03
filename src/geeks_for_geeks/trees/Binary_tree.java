package geeks_for_geeks.trees;

import java.util.*;

public class Binary_tree 
{
	Node root;

	public Binary_tree(Node root) 
	{
		super();
		this.root = root;
	}

	public Binary_tree()
	{
		super();
		root=null;
	}

	public static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.key+" ");
		inorder(root.right);
	}
	public static void preorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.key+" ");
		preorder(root.left);

		preorder(root.right);
	}
	public static void postorder(Node root)
	{
		if(root==null)
			return;
		postorder(root.left);

		postorder(root.right);
		System.out.print(root.key+" ");
	}
	public static void printlevellorder(Node root)
	{
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			System.out.print(temp.key+" ");
			if(temp.left!=null)q.add(temp.left);
			if(temp.right!=null)q.add(temp.right);


		}



	} 
	public static void inorder_stack(Node root)
	{
		Node temp=root;
		Node curr;

		Stack<Node> s=new Stack<Node>();
		while(temp!=null)
		{
			s.push(temp);
			temp=temp.left;
		}
		while(!s.isEmpty())
		{
			temp=s.pop();
			System.out.print(temp.key+" ");
			if(temp.right!=null)
			{
				temp=temp.right;

				while(temp!=null)
				{
					s.push(temp);
					temp=temp.left;
				}
			}
		}

	}


}
class Node
{
	int key;
	Node left;
	Node right;
	public Node(int key)
	{
		super();
		this.key = key;
		this.left=null;
		this.right=null;
	}
}



