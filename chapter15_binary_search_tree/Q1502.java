package chapter15_binary_search_tree;

//Q: Find the first occurance of a key in a BST
public class Q1502 {
	
	//idea: just like find the first occurance of k in sorted array
	//use BST idiom: store the best candidate as result and update the result as we iterate the descending tree
	public static BinarySearchTreeNode findFirstEqualK(BinarySearchTreeNode root, int k){
		BinarySearchTreeNode result = null;
		while(root != null){
			if(root.data > k){
				findFirstEqualK(root.left, k);
			}else if (root.data == k){
				result = root;
			}else{
				findFirstEqualK(root.right, k);
			}
		}
		return result;
	}

}
