package chapter8_linked_list;

// merge two-sorted linked lists

public class Q0801 {

	public static void main(String[] args) {
		ListNode h1 = new ListNode(3);
		ListNode h2 = new ListNode(2);
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.add(h1);
		l2.add(h2);
		
		ListNode head = new ListNode();
		head = merge(l1.head, l2.head);
		while(head != null){
			System.out.println(head.getData());
			head = head.getNext(head);
		}

	}
	
	
	//return the head of merged list
	//using recursing, time complexity O(a+b)
	public static ListNode merge (ListNode A, ListNode B){
		if(A == null){
			return B;
		}
		if(B == null){
			return A;
		}
		if(A.data < B.data){
			A.next = merge(A.next, B);
			return A;
		}
		else{
			B.next = merge(A, B.next);
			return B;
		}
		
		
		
	}

}
