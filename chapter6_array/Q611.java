package chapter6_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Q: compute the next permutation
public class Q611 {
	
	// idea: 
	// 1. find k such that numbers after index k are in decreasing order and A[k] < A[k+1]-> [6,2,1,5,4,3,0], A[k] = 1
	// 2. find the smallest A[l] that A[l] > A[k], l in range [k+1, end]-> A[l] = 3
	// 3, swap A[l] and A[k]
	// 4. reverse numbers after index k
	
	public static List<Integer> nextPermutation(List<Integer> A){
		if(A.size() == 1)
			return null;
		
		//find k
		int k = A.size() - 2;
		while(k >= 0 && A.get(k + 1) <= A.get(k)){
			k--;
		}
		
		if(k == -1){
			return Collections.emptyList();
		}
//		System.out.println(A.get(k));
		//find l
		int l = A.size() - 1;
		while(l > k){
			if(A.get(l) > A.get(k)){ 
				break;
			}
			l--;
		}
//		System.out.println(A.get(l));
		//swap A[k], A[l]		
		Collections.swap(A, l, k);
//		System.out.println(A.toString());
		
		//reverse
		Collections.reverse(A.subList(k + 1, A.size()));
		
		return A;
		
	}
	
	public static void main(String[] args){
		List<Integer> A = new ArrayList<>(Arrays.asList(6,2,1,5,4,3,0));
		List<Integer> B = new ArrayList<>(Arrays.asList(7,3,5));
		System.out.println(nextPermutation(B));
	}
}
