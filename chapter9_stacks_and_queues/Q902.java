package chapter9_stacks_and_queues;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

// Q: evaluate reverse polish notation(RPN) of an arithmetical expression

public class Q902 {
	
	public static int RPN(String[] tokens){
		Deque<Integer> stack = new LinkedList<>();
		for(int i = 0; i < tokens.length; i++){
			if("-/*+".contains(tokens[i])){
				int x = stack.removeFirst();
				int y = stack.removeFirst();
				if(tokens[i] == "+")
					stack.push(x + y);
				else if(tokens[i] == "-")
					stack.push(y - x);
				else if(tokens[i] == "/")
					stack.push(y/x);
				else
					stack.push(x*y);	
			}else{
				stack.push(Integer.parseInt(tokens[i]));
			}
		}
		return stack.removeFirst();
	}

	private static List<String> split(String input, char delimiter) {
		List<String> content = new ArrayList<>();
		int start = 0;
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == delimiter && i > 0){
				System.out.println(i);
				content.add(input.substring(start, i));
				start = i + 1;
			}
		}
		content.add(input.substring(start));
		return content;
	}
	
	public static void main(String[] args){
		String[] content = {"3","-4","+"};
		System.out.println(RPN(content));
	}

}
