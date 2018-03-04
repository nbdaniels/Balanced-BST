/**
 * Programmed by: Noah Daniels
 * February 28, 2014
 * BST.java
 *
 * The class defining Binary Search tree with a height-balancing property
 * that reflects the structure of an AVL tree
 */ 

public class BST
{
	BSTNode root;
	
	public BST()
	{
		root = null;
	}
	
	// insert a new BSTNode into the correct spot in the AVL tree
	public boolean insert(String title){
		//if there is no root node, initialize one
		if (root == null)
		{
			root = new BSTNode(title);
			return true;
		}
		
		BSTNode node = root;
		
		//cycle through nodes to find where new node fits in
		while (node != null)
		{
			if (title.compareTo(node.data) < 0)
			{
				if (node.left == null)
				{
					node.left = new BSTNode(title);
					balance(root);
					return true;
				}
				else
				{
					node = node.left;
				}
			}
			 
			else if (title.compareTo(node.data) > 0)
			{
				if (node.right == null)
				{
					node.right = new BSTNode(title);
					balance(root);
					return true;
				}
				else
				{
					node = node.right;
				}
			}
			else
				return false;
		}
		return false;
	}

	//search through AVL tree until a match is found, or else return false
	public boolean find(String title){
		BSTNode node = root;
		
		while (node != null)
		{
			if (node.data.equals(title))
				return true;
			else if (title.compareTo(node.data) < 0)
				node = node.left;
			else
				node = node.right;
		}
		return false;
	}

	// remove the left child of a node and set nodes back in place
	public void removeLeft(BSTNode n){
		BSTNode temp = n.left.left;
		n.left = n.left.right;
		if (n.left == null)
			return;
		while(n.left.left != null)
			n = n.left;
		n.left.left = temp;
	}
	
	// remove the right child of a node and set nodes back in place
	public void removeRight(BSTNode n){
		BSTNode temp = n.right.right;
		n.right = n.right.left;
		if (n.right == null)
			return;
		while(n.right.right != null)
			n = n.right;
		n.right.right = temp;
	}

	// remove the root node from the tree and set nodes back in place
	public void removeRoot(){
		if (root.left != null)
		{
			BSTNode temp = root.right;
			root = root.left;
			BSTNode n = root;

			if (root == null)
				return;
			while (n.right != null)
				n = n.right;
			n.right = temp;
		}
		else
		{
			BSTNode temp = root.left;
			root = root.right;
			BSTNode n = root;

			if (root == null)
				return;
			while (n.left != null)
				n = n.left;
			n.left = temp;
		}
	}
	
	/* remove a specified node in the tree, if it is in the tree
	 * and set nodes back into place
	 * update the heights of each node in the tree and balance if necessary
	 */
	public boolean remove(String title){
		if (root == null)
			return false;
		
		BSTNode n = root;
		
		if (title.equals(root.data))
		{
			removeRoot();
			balance(root);
			return true;
		}
		
		if (title.compareTo(root.data) > 0)
		{
			while (n.right != null)
			{
				if (title.equals(n.right.data))
				{
					removeRight(n);
					balance(root);
					return true;
				}
				n = n.right;
			}
		}
		
		else
		{
			n = root;
			while (n.left != null)
			{
				if (title.equals(n.left.data))
				{
					removeLeft(n);
					balance(root);
					return true;
				}
				n = n.left;
			}
		}
		
		return false;
	}

	// get the maximum height of the node
	private int getHeight(BSTNode node) {
	    if (node == null) return 0;
	    int getHeightL = 1 + getHeight(node.left);
	    int getHeightR = 1 + getHeight(node.right);
		return getHeightL > getHeightR ? getHeightL : getHeightR;
	}
	
	// balances the tree if the height of the left and right subtrees differ by more than 1
	public void balance(BSTNode node){
		if (node != null)
		{
			int leftHeight = getHeight(node.left);
			int rightHeight = getHeight(node.right);
			if (Math.abs(leftHeight - rightHeight) > 1)
			{
				if (leftHeight > rightHeight)
				{
					rotateRight(node);
					return;
				}
				else if (rightHeight > leftHeight)
				{
					rotateLeft(node);
					return;
				}
			}
		}
		else
			return;
		balance(node.left);
		balance(node.right);
	}
	
	// balances the unbalanced node if the right subtree is longer than the left subtree
	public void rotateLeft(BSTNode node)
	{
		BSTNode x = node.right;
		if (node == root)
			root = x;
		node.right = x.left;
		x.left = node;
	}
	
	// balances the unbalanced node if the left subtree is longer than the right subtree
	public void rotateRight(BSTNode node)
	{
		BSTNode x = node.left;
		if (node == root)
			root = x;
		node.left = x.right;
		x.right = node;
	}
	
	public BSTNode getRoot()
	{
		return root;
	}
}