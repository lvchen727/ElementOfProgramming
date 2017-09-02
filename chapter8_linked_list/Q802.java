package chapter8_linked_list;

//Q: reverse a singly linkedlist (sorted)
public class Q802 {
	
	// the normal way of implementing reverse is using recursion
	//O(n)t, O(n)sp
	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null){
			return head;
		}
		
		ListNode newHead = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	
	//use a temporal pointer to save space
	//O(n)t, O(1)sp
	public static ListNode reverseList2(ListNode current){
		ListNode prev = null;
		while(current != null){
			ListNode next = current.next;
			current.next = prev;
			current = next;
			next = prev;
		}
		return prev;	
	}

}
