package chapter10_binary_trees;

//Q: test if a binary tree is symmetric
public class Q1002 {
	
	//idea: recursively solve problem. tree.left.data == tree.right.data
	
	public static boolean isSymmetric(BinaryTreeNode root){
		if(root == null){
			return true;
		}
		return helpSymmetric(root.left, root.right);
	}
	
	public static boolean helpSymmetric(BinaryTreeNode left, BinaryTreeNode right){
		if(left == null && right == null){
			return true;
		}else if(left != null && right != null){
			if(left.data == right.data){
				boolean first = helpSymmetric(left.left, right.right);
				boolean second = helpSymmetric(left.right, right.left);
				return first && second;
			}
		}
		
		return false;
	}

}
