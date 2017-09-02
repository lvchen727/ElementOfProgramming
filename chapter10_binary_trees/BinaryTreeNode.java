package chapter10_binary_trees;



public class BinaryTreeNode {
	
	public int data;
	public BinaryTreeNode left, right; 
	public BinaryTreeNode parent;
	
	private static void traverseBinaryTree(BinaryTreeNode root){
		if(root != null){
			//preorder
			System.out.println("pre-order" + root.data);
			
			//inorder
			traverseBinaryTree(root.left);
			System.out.println("in-order" + root.data);
			
			//post-order
			traverseBinaryTree(root.right);
			System.out.println("post-order" + root.data);
			
		}
			
		
	}


}


