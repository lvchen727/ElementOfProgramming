package chapter15_binary_search_tree;

public class SearchBST {
	
	public static BinarySearchTreeNode searchBST(BinarySearchTreeNode tree, BinarySearchTreeNode target){
		if(tree == null){
			return tree;
		}
		
		return tree.data > target.data ? searchBST(tree.left, target) 
				                       : searchBST(tree.right, target);
	}
}
