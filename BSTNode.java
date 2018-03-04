/**
 * Programmed by: Noah Daniels
 * February 28, 2014
 * BSTNode.java
 *
 * User-defined node which is implemented in the
 * BST class.
 * 
 */ 

public class BSTNode
{
	String data;
	BSTNode left;
	BSTNode right;
	int height;
	
	// since a new node is added to the bottom of the tree,
	// height is 0
	public BSTNode(String data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
		height = 0;
	}
}