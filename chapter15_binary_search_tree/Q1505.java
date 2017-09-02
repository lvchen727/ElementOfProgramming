package chapter15_binary_search_tree;

//Q: Compute the LCA in a BST
public class Q1505 {
	
	public static BinarySearchTreeNode LCA(BinarySearchTreeNode root, BinarySearchTreeNode n1, BinarySearchTreeNode n2){
		
		//asume n1.data <= n2.data
		//three case:
		// 1. n1.data < root.data < n2.data, return root
		// 2. n2.data >= n1.data > root.data , root = root.right
		// 3. root.data > n2.data >= n1.data, root = root.left
		BinarySearchTreeNode result = root;
		while(result.data < n1.data || result.data > n2.data){
			while(result.data < n1.data){
				result = result.right;
			}
			while(result.data > n2.data){
				result = result.left;
			}
		}
		return result;
	}

}
