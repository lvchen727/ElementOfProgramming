package chapter9_stacks_and_queues;

// implement stack with max API

public class Q0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.pop();
		System.out.println(stack.max());
		
		Stack2 stack2 = new Stack2();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.pop();
		System.out.println(stack2.max());
	}
	
}

