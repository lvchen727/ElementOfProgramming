package chapter8_linked_list;

import java.util.List;

// test for cyclicity
public class Q804 {
	
	//1. brute-force: hash table
	
	
	//2. brute-force: two loops
	
	
	//3. use two iterators, one slow and one fast
	// return the start node of the cycle if it exit otherwise null
	// calculate cycle length
	// O(n)
	public static ListNode testCyclicity(ListNode head){
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null){
			slow = head.next;
			fast = head.next.next;
			
			//find the cycle length 
			int cycleLength = 0;
			if(slow == fast){ // fast and slow could meet any place in the cycle, once they meet, slow stays, fast increment to meet slow again
				cycleLength += 1;
				while(slow != fast){
					cycleLength +=1;
					fast = fast.next;
				}
			}
			 
			// cycleLengthNode + A =  A
			ListNode cycleLengthNode = head;
			while(cycleLength != 0){
				cycleLengthNode = cycleLengthNode.next;
				cycleLength --;
			}
			
			ListNode iter = head;
			while( iter != cycleLengthNode){
				iter = iter.next;
				cycleLengthNode = cycleLengthNode.next;
			}
			return iter;
		}
		return null;
	}
	
	// https://stackoverflow.com/questions/2936213/explain-how-finding-cycle-start-node-in-cycle-linked-list-work
	// m : length from 0 to cyclestart
	// n: cycle length
	// x: length from cyclestart to metpoint
	// i = m + x + p * n
	// 2i = m + x + q * n
	// 2(m + x + p * n) = m + x + q * n  ->   m + x  = (q- 2p) * n 
	public static ListNode hasCycle(ListNode head){
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast){ // metpoint, if we let them both go 1 step pace for (m+x) steps , they would meet again at metpoint (m+x is multiple of n);
						      // now instead, let them move m steps, they would meet at cyclestart;
				slow = head;
				while(slow != fast){
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}

}
