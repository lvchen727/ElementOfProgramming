package chapter8_linked_list;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(){
		this(0, null);
	}
	
	public ListNode(int data){
		this(data, null);
	}
	
	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
	
	public int getData(){
		return this.data;
	}
	
	public ListNode getNext(ListNode current){
		return current.next;
	}
	
	public void setNext(ListNode nextNode){
		this.next = nextNode;
	}
}
