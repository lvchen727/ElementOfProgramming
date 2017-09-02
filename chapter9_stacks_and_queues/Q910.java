package chapter9_stacks_and_queues;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

//Q: implement a circular queue
public class Q910 {
	
	// circular queue: a queue can be implement using an array and two additional fields, the begining and end indices.
	// implement a dynamic resizing to support storing an arbitrarily large number of elements
	// use two pointers (front and rear) to track the first and last element in queue, intialize both as -1
	// enque: add value to the position pointed to by rear, and increment rear by 1
	// deque: remove value pointed by front, and increase front index
	// resize Arrays.copyof(originalArray, sizeFactor)
	
	public static void main(String[] args){
		int[] test = {1,2,1};
		test = Arrays.copyOf(test, 4) ;
		System.out.println(test.length);
		for(int i : test){
			System.out.println(i);
		}
	}
}

class CircularQueue{
	public int[] entries;
	int front = 0, rear = 0;
	int numOfElements;
	final int SizeFactor = 2;
	public CircularQueue(int capacity){
		entries = new int[capacity];
	}
	
	public void enque(int n){
		if(numOfElements == entries.length){
			//make sure the array is consecutive
			Collections.rotate(Arrays.asList(entries), -front);
			
			// need to resize queue
			entries = Arrays.copyOf(entries, numOfElements * SizeFactor); // the latter is the size of new array
			
			//reset front and rear
			front = 0;
			rear = numOfElements;
		}
		
		entries[rear] = n;
		rear = (rear + 1) % entries.length;
		numOfElements++;
	}
	
	public int deque(){
		if(numOfElements != 0){
			int dequedElement = entries[front];
			front = (front + 1) % entries.length;
			numOfElements --;
			return dequedElement;
		}
		throw new NoSuchElementException("queue is empty");
		
		
	}
	
	public int size(){
		return numOfElements;
	}
}