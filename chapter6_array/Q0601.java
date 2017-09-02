package chapter6_array;

//quicksort: <pivot, pivot, >pivot

public class Q0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test swap function
		int[] array = {1,2};
		swap(0, 1, array);
		for(int i : array){
			System.out.print(i+",");
		}
		
		System.out.println("");
		//test
		DutchFlagPartition2(1, array);
		for(int i : array){
			System.out.print(i+",");
		}
	}
	
	//time: O(n2), space: O(1)
	public static void DutchFlagPartition (int pivot_index, int[] A){
		int pivot = A[pivot_index];
		
		//group "<pivot"
		for(int i = 0; i < A.length; i++){
			for(int j = i+1; j < A.length; j++){
				if(A[j] < pivot)
					swap(i, j, A);
			}
		}
		
		//group ">pivot"
		for(int i = A.length - 1; i >=0 && A[i] >= pivot; i--){
			for(int j = i - 1; j >=0 && A[j] >= pivot; j--){
				if(A[j] > pivot)
					swap(i, j, A);
			}
		}
	}
	
	//time: O(n), space: O(1)
	public static void DutchFlagPartition1(int pivot_index, int[] A){
		int pivot = A[pivot_index];
		
		//group "<pivot"
		int smallest = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] < pivot)
				swap(i, smallest++, A);
		}
		
		//group ">pivot"
		int largest = A.length - 1;
		for(int i = A.length - 1; i >=0 && A[i] >= pivot; i--){
			if(A[i] > pivot)
				swap(i, largest--, A);
	
		}
	}
	
	//time: O(n), space: O(1)
	//unclassified -> bottom, middle, top
	//bottom A[0...smallest - 1]
	//middle A[smallest...equal - 1]
	//unclassified A[equal... largest - 1]
	//top A[largest... A.length-1]
	public static void DutchFlagPartition2(int pivot_index, int[] A){
		int pivot = A[pivot_index];
		int smallest = 0, equal = 0, largest = A.length;
		//A[equal] is incoming unclassified element
		//keep iterating until there is no more unclassified element
		while(equal < largest){
			if(A[equal] < pivot)
				swap(equal++, smallest++, A);
			else if(A[equal] == pivot)
				++equal;
			else 
				swap(equal, --largest, A);
		}
		
	}
	
	public static void swap(int a, int b, int[]A){
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
}
