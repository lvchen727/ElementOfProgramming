package chapter9_stacks_and_queues;

import java.util.Deque;
import java.util.LinkedList;

// this is the stack designed for 0901 method1

// time O(1); space O(n)
public class Stack {
	
	//store (element, stack) for each entry in the stack
	private Deque<ElmentWithCachedMax> stack = new LinkedList<>();
	
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	//exceptions are important!!!!!!
	public Integer max(){
		if(stack.isEmpty())
			throw new IllegalStateException("max(): empty");
		return stack.peekFirst().max;
	}
	
	public Integer pop(){
		if(stack.isEmpty())
			throw new IllegalStateException("max(): empty");
		ElmentWithCachedMax currentElementWithMax = stack.pop();
		return currentElementWithMax.element;
	}
	
	public void push(Integer e){
		if(!stack.isEmpty())
			stack.push(new ElmentWithCachedMax(e, Math.max(e, stack.peekFirst().max)));
		else
			stack.push(new ElmentWithCachedMax(e, e));
	}
}
