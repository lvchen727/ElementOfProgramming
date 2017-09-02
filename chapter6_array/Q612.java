package chapter6_array;

import java.util.Collections;
import java.util.List;
import java.util.Random;

//Q: sample offline data
//implement an algorithm that takes an input an array of distinct elements and a size, and returns a subset of the give size of the array elements
public class Q612 {
	
	//O(n)t, O(1)sp
	// know how to use Random API
	public static void offlineRandomSample(List<Integer> A, int size){
		Random randomGenerator = new Random();
		for(int i = 0; i < A.size(); i++ ){
			Collections.swap(A, i, i+ randomGenerator.nextInt(A.size() - i));
		}
	}
}
