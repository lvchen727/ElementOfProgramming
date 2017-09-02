package chapter8_linked_list;

//Q: remove the kth last element from the list
// assume list is too large to get the list length
public class Q808 {
	
	//idea: two iterators
	//one advance k more steps, then both of them advance simultaneously until the eariler one reach the end. 
	// the later one now points to the kth last element
	public static ListNode removeKthLastElement(ListNode root, int k){
		ListNode first = root, second = root;
		int steps = k;
		while(steps >= 0){
			first = first.next;
			steps--;
		}
		while(first != null){
			first = first.next;
			second = second.next; 
		}
		ListNode kthLastElement = second.next;
		second.next = second.next.next;
		return kthLastElement;
	}
	

}
