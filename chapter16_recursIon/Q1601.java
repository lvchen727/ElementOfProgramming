package chapter16_recurson;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

//recursion:
//two key ingredients: 1. base case 2. ensure progress
// similar but different from divide-and-conquer(mergsort, quicksort).
// recursion is good choice for search, enumeration, divide-and-conquer
// remove recursion -> 1. stack 2. tail-recursive, using while loop

//Q: compute the towers of hanoi 
public class Q1601 {
	
	public static final int NUM_PEGS = 3;
	public static void computeTowerHanoi(int numRings){
		List<Deque<Integer>> pegs = new ArrayList<>(); 
		
		//intialize pegs
		for(int i = 0; i < NUM_PEGS; i++){
			pegs.add(new LinkedList<Integer>()); //linkedlist is used to implement stack data structure
		}
		
		//initialize peg 0
		for(int i = numRings; i >= 1; i--){
			pegs.get(0).add(i);
		}
		
		//compute towers of hanoi
		computeTowerHanoiStep(numRings, pegs, 0, 1, 2);;
		
	}
	
	public static void computeTowerHanoiStep(int numberOfRingsToMove, List<Deque<Integer>> pegs, int fromPeg, int toPeg, int usePeg){
		if(numberOfRingsToMove > 0){
			computeTowerHanoiStep(numberOfRingsToMove - 1, pegs, fromPeg, usePeg, toPeg);
			pegs.get(toPeg).add(pegs.get(fromPeg).removeFirst());
			System.out.println("move from peg " + fromPeg + " to peg" + toPeg);
			computeTowerHanoiStep(numberOfRingsToMove - 1, pegs, usePeg, toPeg, fromPeg);
		}
	}
	
	public static void main(String[] args){
		computeTowerHanoi(3);
	}
}
