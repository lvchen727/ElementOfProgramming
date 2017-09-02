package chapter8_linked_list;

//implement basic API of linkedlist: search, insert, delete

public class LinkedList {
	
	public ListNode head;
	public ListNode tail;
	public int size;
	
	public LinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	
	//add to front
	public void add(ListNode L){
		if(this.head == null){
			this.head = L;
			this.tail = head;
		}else{
			L.next = this.head;
			this.head = L;
		}
		this.size += 1;
	}
	
	public ListNode getHead(){
		return this.head;
	}
	
	
	//search node containing data from node L
	public static ListNode search(ListNode L, int data){
		while(L != null && L.data != data){
			L = L.next;
		}
		
		return L;
	}
	
	//insert after node L
	public static void insert(ListNode L, ListNode newL){
		newL.next = L.next;
		L.next = newL;
		
	}
	
	//delete node following L
	public static void delete(ListNode L){
		L.next = L.next.next;
	}

}
