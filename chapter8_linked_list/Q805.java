package chapter8_linked_list;

//Q: test for overlapping lists
public class Q805 {
	
	// idea: like find the LCA of two nodes in binary tree: 
	//advance the longer one by their length difference, then advance them simultaneously until reaching the same node
	public static ListNode overlappingLists(ListNode l1, ListNode l2){
		int lenL1 = findLength(l1);
		int lenL2 = findLength(l2);
		advanceList(Math.abs(lenL1 - lenL2), lenL1 > lenL2 ? l1 : l2);
		while(l1 != null && l2 != null && l1 != l2){
				l1 = l1.next;
				l2 = l2.next;
		}
		return l1;
	}
	
	public static int findLength(ListNode l){
		int len = 0;
		while(l!= null){
			len ++;
			l = l.next;
		}
		return len;
	}
	
	public static void advanceList(int diff, ListNode l){
		while(diff > 0){
			l = l.next;
			diff --;
		}
	}
}
