package Chapter11_heap;

import java.util.PriorityQueue;

//Q: sort an almost sorted array
//each element is at most k away from its final position
public class Q1103 {
	
	//use heap structure
	public static void sortAlmostSortedArray(int[] A, int k){
		//min-heap
		PriorityQueue<Integer>  minHeap = new PriorityQueue<>(k+1);
		for(int j = 0; j <= k; j++){
			minHeap.add(A[j]);
		}
		int i = 0;
		while( i < A.length - k - 1){
			A[i] = minHeap.poll();
			minHeap.add(A[i + k + 1]);
			i++;
		}
		
		while(minHeap.size() >= 0 && i < A.length){
			A[i++] = minHeap.poll();
		}
	}
	
	public static void main(String[] args){
		int[] A = {3,1,-2, 4, 6, 5, 8};
		sortAlmostSortedArray(A, 2);
		for(int i : A){
			System.out.print(i + ",");
		}
	}
}
