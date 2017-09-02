package chapter15_binary_search_tree;

//binary search tree (BST)
//similar to sorted arrays
// operations: min, max, lookfor successor/predecessor, enumerate, add/delete/find key -> O(logn) time complexity
// BST property: L<M<R
// "height-balanced" => h = O(logn) , exp: black red tree

// JAVA: TreeSet, TreeMap 
// operations: iterator(), descendingIterator(), last/first/lower/higher/floor/ceiling, headSet/subSet/tailSet

//Q: test if BST satisfies BST property, i.e., L< M < R
public class Q1501 {
	
	// 1. left_child in range [lower, m] && right_child in range [m, upper]
	//  time complexity: O(n)
	public static boolean isBinaryTreeBST(BinarySearchTreeNode tree){
		return isNodeInRange(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isNodeInRange(BinarySearchTreeNode tree, int lower, int upper){
		if(tree == null){
			return true;
		}
		if(tree.data > lower || tree.data > upper){
			return false;
		}
		return isNodeInRange(tree.left, lower, tree.data) && isNodeInRange(tree.right, tree.data, upper);
	}
	
	// 2. use queue (p.258 in JAVA book)
	
}
