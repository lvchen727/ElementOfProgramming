package chapter15_binary_search_tree;

//Q: Find the first key larger than a given value in BST
public class Q1503 {
	
	//idea: use BST idiom - store the best candidate for the result and update the candidate as we iterate the descending tree
	public static BinarySearchTreeNode findFirstGreaterThanK(BinarySearchTreeNode root, int k){
		BinarySearchTreeNode result = null;
		while(root != null){
			if(root.data > k){
				result = root;
				findFirstGreaterThanK(root.left, k);
			}else{
				findFirstGreaterThanK(root.right, k);
			}
		}
		return result;
	}
}
