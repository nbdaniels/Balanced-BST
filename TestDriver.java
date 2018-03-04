public class TestDriver{
	static BST tree, tree2;
	
	public static void main(String[] args)
	{
		///////////////////////////////////////////
		tree = new BST();
		System.out.print("Test 8: ");
		tree.remove("1");
		if (inorder(tree.getRoot()).equals(""))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 1: ");
		tree.insert("1");
		if (inorder(tree.getRoot()).equals("1"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 9: ");
		tree.remove("2");
		if (inorder(tree.getRoot()).equals("1"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 10: ");
		tree.remove("1");
		if (inorder(tree.getRoot()).equals(""))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 7: ");
		tree.insert("1");
		if (inorder(tree.getRoot()).equals("1"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 2: ");
		tree.insert("0");
		if (inorder(tree.getRoot()).equals("01"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 11: ");
		tree.remove("0");
		if (inorder(tree.getRoot()).equals("1"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 12: ");
		tree.insert("0");
		tree.remove("1");
		if (inorder(tree.getRoot()).equals("0"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 3: ");
		tree2 = new BST();
		tree2.insert("1");
		tree2.insert("2");
		if (inorder(tree2.getRoot()).equals("12"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 13: ");
		tree2.remove("2");
		if (inorder(tree2.getRoot()).equals("1"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 14: ");
		tree2 = new BST();
		tree2.insert("1");
		tree2.insert("2");
		tree2.remove("1");
		if (inorder(tree2.getRoot()).equals("2"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.println("Test 4: ");
		System.out.print("	Case 1: ");
		tree = new BST();
		tree.insert("1");
		tree.insert("0");
		tree.insert("-1");
		if (inorder(tree.getRoot()).equals("-101"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 2: ");
		tree = new BST();
		tree.insert("1");
		tree.insert("-1");
		tree.insert("0");
		if (inorder(tree.getRoot()).equals("-101"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 3: ");
		tree = new BST();
		tree.insert("1");
		tree.insert("0");
		tree.insert("2");
		if (inorder(tree.getRoot()).equals("012"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.println("Test 5: ");
		System.out.print("	Case 1: ");
		tree2 = new BST();
		tree2.insert("1");
		tree2.insert("2");
		tree2.insert("-1");
		if (inorder(tree2.getRoot()).equals("-112"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 2: ");
		tree2 = new BST();
		tree2.insert("0");
		tree2.insert("2");
		tree2.insert("1");
		if (inorder(tree2.getRoot()).equals("012"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 3: ");
		tree2 = new BST();
		tree2.insert("0");
		tree2.insert("1");
		tree2.insert("2");
		if (inorder(tree2.getRoot()).equals("012"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.println("Test 6: ");
		System.out.print("	Case 1: ");
		tree2 = new BST();
		tree2.insert("2");
		tree2.insert("3");
		tree2.insert("1");
		tree2.insert("0");
		if (inorder(tree2.getRoot()).equals("0123"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 2: ");
		tree2 = new BST();
		tree2.insert("2");
		tree2.insert("3");
		tree2.insert("0");
		tree2.insert("1");
		if (inorder(tree2.getRoot()).equals("0123"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 3: ");
		tree2 = new BST();
		tree2.insert("0");
		tree2.insert("2");
		tree2.insert("-2");
		tree2.insert("1");
		if (inorder(tree2.getRoot()).equals("-2012"))
			System.out.println("true");
		else
			System.out.println("false");
		System.out.print("	Case 4: ");
		tree2 = new BST();
		tree2.insert("0");
		tree2.insert("2");
		tree2.insert("-2");
		tree2.insert("3");
		if (inorder(tree2.getRoot()).equals("-2023"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.println("Test 15: ");
		tree = new BST();
		tree.insert("0");
		tree.insert("-1");
		tree.insert("1");
		System.out.print("	Case 1: ");
		tree.remove("-1");
		if (inorder(tree.getRoot()).equals("01"))
			System.out.println("true");
		else
			System.out.println("false");
		tree = new BST();
		tree.insert("0");
		tree.insert("-1");
		tree.insert("1");
		System.out.print("	Case 2: ");
		tree.remove("0");
		if (inorder(tree.getRoot()).equals("-11"))
			System.out.println("true");
		else
			System.out.println("false");
		tree = new BST();
		tree.insert("0");
		tree.insert("-1");
		tree.insert("1");
		System.out.print("	Case 3: ");
		tree.remove("1");
		if (inorder(tree.getRoot()).equals("-10"))
			System.out.println("true");
		else
			System.out.println("false");
		///////////////////////////////////////////
		System.out.print("Test 16: ");
		tree = new BST();
		tree.insert("2");
		tree.insert("1");
		tree.insert("0");
		tree.insert("3");
		tree.remove("3");
		if (inorder(tree.getRoot()).equals("012"))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	public static String inorder(BSTNode node){
		if (node == null)
			return "";
		return "" + inorder(node.left) + node.data + inorder(node.right);
	}
}