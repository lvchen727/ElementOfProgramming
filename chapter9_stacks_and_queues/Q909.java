package chapter9_stacks_and_queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import chapter10_binary_trees.BinaryTreeNode;

//Q: compute binary tree nodes in order of increasing depth
public class Q909 {

	//use queue: FIFO
	// O(n)t  where n is number of nodes
	// O(m)sp where m is max number of nodes at one depth
	public static List<List<Integer>> BinaryTreeDepthOrder(BinaryTreeNode head){
		List<List<Integer>> result = new ArrayList<>();
		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(head);
		while(!queue.isEmpty()){
			List<Integer> currentDepthNums = new ArrayList<>();
			BinaryTreeNode currentDepthNodes = queue.poll();
			if(currentDepthNodes != null){
				currentDepthNums.add(currentDepthNodes.data);
				queue.add(head.left);
				queue.add(head.right);
			}
			if(!currentDepthNums.isEmpty()){
				result.add(currentDepthNums)
;			}
		}
		return result;
	}
}
