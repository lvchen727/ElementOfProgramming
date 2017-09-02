package chapter14_sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//sorting
//naive algo: O(n2)
// O(nlogn); 1. heapsort (inplace but not stable) 2. mergesort (stable but not inplace) 3.quicksort(usually best, O(n2) worst case)
// some specific circumstances:
// 1. short arrays -> insertion sort
// 2. each element is <=k places from its final location -> minheap, O(nlogk)
// 3. a few distinct key -> counting sort
// 4. many duplicates -> add keys to BST with linkedlist for elemtns having same key
// 5. radix sort: directly use numerical attributes rather than compare function

//JAVA: Arrays.sort(array) or  Collections.sort(list)

//note: the way to eliminate duplicates
//for(int i = 0; i < a.size(); i++){
//	if(i== 0 || a.get(i) != a.get(i-1)){
//		
//	}
//}

//Q: compute intersection of 2 sorted arrays
// <2,3,4,5,5,8,9>, <2,5,10> -> <2,5>
public class Q1401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>(Arrays.asList(2,3,4,5,5,8,9));	
		List<Integer> l2 = new ArrayList<>(Arrays.asList(2,5,10));
		List<Integer> mergeL1L2 = intersectTwoSortedArrays3(l1, l2);
		System.out.println(mergeL1L2.toString());

	}
	
	//1. brute force: O(mn)
	public static List<Integer> intersectTwoSortedArrays3(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList<>();
		for(int i = 0 ; i < a.size(); i++){
			if(i == 0 || a.get(i) != a.get(i-1)){
				for(Integer j : b){
					if(j == a.get(i)){
						result.add(j);
					}
				}
			}
		}
		return result;
	}
	
	//2. use binary search: O(mlogn) if m<n otherwist O(nlogm)
	//best case when one of list is much smaller than the other
	public static List<Integer> intersectTwoSortedArrays2(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < a.size(); i++){
			if(i== 0 || a.get(i) != a.get(i-1)){
				if(Collections.binarySearch(b, a.get(i)) >= 0)
					result.add(a.get(i));
			}
		}
		return result;
	}
	
	//3. two pointers: advance two sorted arrays simultaneously
	// there are two possibilities: a. != -> eliminate smaller one  b. == -> add to result
	//best case when the two lists have similar length
	public static List<Integer> intersectTwoSortedArrays(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList<>();
		int i = 0, j = 0;
		while( i < a.size() && j < b.size()){
			if(a.get(i) == b.get(j)){
				result.add(a.get(i));
				i++;
				j++;
			}else{
				if(a.get(i) < b.get(j))
					i++;
				else
					j++;
			}
		}
		return result;
	}

}
