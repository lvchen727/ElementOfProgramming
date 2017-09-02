package chapter10_binary_trees;

//test is a BT is balanced, i.e., Math.abs(tree.left.height, tree.right.height) <=1
// 1. both children are balanced 2. Math.abs(tree.left.height, tree.right.height) <=1
public class Q1001 {
		
	public static boolean isBinaryTreeBalanced(BinaryTreeNode tree){
		return checkBalance(tree).isBalanced;
		
	}
		
	public static BalancedStatusWithHeight checkBalance(BinaryTreeNode tree){
		if(tree == null)
			return new BalancedStatusWithHeight(true, -1);
		
		BalancedStatusWithHeight rightTree = checkBalance(tree.right);
		if(!rightTree.isBalanced)
			return rightTree;
		BalancedStatusWithHeight leftTree = checkBalance(tree.left);
		if(!leftTree.isBalanced)
			return leftTree;
		
		
		int height = Math.max(leftTree.height, rightTree.height) + 1;
		boolean isbalanced = Math.abs(leftTree.height - rightTree.height) <=1;
		return new BalancedStatusWithHeight(isbalanced, height);
		
	}
	
}



class BalancedStatusWithHeight{
	public boolean isBalanced;
	public int height;
	
	public BalancedStatusWithHeight(boolean isBalanced, int height){
		this.height = height;
		this.isBalanced = isBalanced;
	}
}


