package chapter12_searching;

import java.util.ArrayList;
import java.util.List;

//binary search
//easy mistakes : 1. corner cases; 2. m = (l+h)/2 leading to overflow => m = l + (h-l)/2
//JAVA: 1. Arrays.binarySearch(A, "Euler")   2. Collections.binarySearch(list, 24)
// time complexity: arraylist O(logn); linkedlist O(n)


//Q: search sorted array for the 1st occurance of k
//once we find k, we record its index i as result
//even though it may not be the smallest, but we eliminate all the elements from [i...n]
public class Q1201 {
	public static int searchSmallest(List<Integer> A, Integer k){
		int low = 0, high  = A.size() - 1, result = -1;
		while(low < high){
			int mid = low + (high - low)/2;
			if (k < A.get(mid)){
				high = mid - 1;
			}else if (k == A.get(mid)){
				result = mid;
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		System.out.println(searchSmallest(list, 4));
	}

}
