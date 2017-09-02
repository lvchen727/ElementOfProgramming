package chapter10_binary_trees;

//Q: compute the lowest common ancester(LCA) of two nodes suppose we know parents
public class Q1004 {

	//1. brute force: store the path of node1 in hashtable; walk from node2 to its parent, return when we see their firs ancester
	// O(n)t, O(n)sp
	
	//2. idea: if they are on the same depth, then just walk up simultaneously until see the first same parent
	// O(n)t, O(1)sp
	public static BinaryTreeNode LCA(BinaryTreeNode n1, BinaryTreeNode n2){
		
		// make n1 the longer node
		if(getDepth(n1) < getDepth(n2)){
			BinaryTreeNode temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		int difference = getDepth(n1) - getDepth(n2);
		while(difference > 0){
			n1 = n1.parent;
			difference--;
		}
		
		while(n1 != n2){
			n1 = n1.parent;
			n2 = n2.parent;
		}
		return n1;
		
	}
	
	
	public static int getDepth(BinaryTreeNode n){
		int depth = 0;
		while(n != null){
			n = n.parent;
			depth ++;
		}
		return depth;
	}

}
