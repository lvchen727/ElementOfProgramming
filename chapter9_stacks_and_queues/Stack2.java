package chapter9_stacks_and_queues;

import java.util.Deque;
import java.util.LinkedList;

//this is the stack designed for 0901 method2

//time O(1); space O(n)
//best-case: space O(1)
public class Stack2 {
	
	private Deque<Integer> stack = new LinkedList<>();
	private Deque<MaxWithCount> maxWithCounts = new LinkedList<>();
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public Integer max(){
		if(stack.isEmpty())
			throw new IllegalStateException("max(): empty");
		return maxWithCounts.peekFirst().max;
		
	}
	
	public Integer pop(){
		if(stack.isEmpty())
			throw new IllegalStateException("max(): empty");
		Integer current = stack.pop();
		if(current.equals(maxWithCounts.peekFirst().max))
			maxWithCounts.peekFirst().count -= 1;
		if(maxWithCounts.peekFirst().count.equals(0))
			maxWithCounts.removeFirst();
		return current;
	}
	
	public void push(Integer e){
		stack.push(e);
		if(!maxWithCounts.isEmpty()){
			if(e.equals(maxWithCounts.peekFirst().max))
				maxWithCounts.peekFirst().count += 1;
			if (Integer.compare(e, maxWithCounts.peekFirst().max)>0)
				maxWithCounts.addFirst(new MaxWithCount(e, 1));
		}else{
			maxWithCounts.addFirst(new MaxWithCount(e, 1));
		}	
	}

}
