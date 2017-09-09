package chapter16_recurson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import chapter6_array.Q611;

//Q: Generate permutations for an array of distinct integers
public class Q1603 {
	
	//idea: generate all permutations that begins with A[0], 
	//then all permutations with A[1], and so on
	// [7,3,5] -> permutations starts with 7, [3,5] -> [5] -> implies [3,5] has single permutation.-> look for permutations for [3,5] starts with 5 -> single permutation [5,3] -> two permutations for [7,3,5] that starts with 7 -> swap 7 and 3, repeat.
	
	public static void generatePermutaion(List<Integer> A){
		List<List<Integer>> result = new ArrayList<>();
		Collections.sort(A);
		directPermutations(result, 0, A);
		
	}

	private static void directPermutations(List<List<Integer>> result, int i, List<Integer> A) {
		
		//reach single permutation
		if(i == A.size() - 1){
			result.add(new ArrayList<>(A));
			System.out.println(A.toString());
		}
		
		//recursive permutate for each A[i]
		for(int j = i; j < A.size() ; j++){
			Collections.swap(A, i, j);
			directPermutations(result, i+1, A);
			Collections.swap(A, i, j);	// after permutation, revert back to [3,5,7] to start next permutation
		}
		
	}
	
	
	//method2 : using nextPermutation function;
	public static List<List<Integer>> generatePermutaion2(List<Integer> A){
		List<List<Integer>> result = new ArrayList<>();
		Collections.sort(A);
		while(!A.isEmpty()){
			result.add(new ArrayList<>(A));
			System.out.println(A.toString());
			A = Q611.nextPermutation(A);
			
		}
		return result;
	}
	
	public static void main(String[] args){
		List<Integer> A  = new ArrayList<>(Arrays.asList(7,3,5));
		generatePermutaion2(A);
	}

}
