package chapter12_searching;

//Q: search a cyclically sorted array
//assume no duplicates
// find the position of the smallest element in a cyclic sorted array
// 378 478 550 631 103 203 220 234 -> 103
public class Q1203 {

	//idea: two cases:
	// 1 : A[m] < A[n-1] , search among A[.....m]
	// 2:  A[m] > A[n-1] , search among A[m+1.....]
	public static int searchCyclicalArray(int[] A){
		int low = 0;
		int high = A.length - 1;
		while(low < high){
			int mid = low + (high - low)/2;
			if(A[mid] < A[high]){
				high = mid;
			}else if(A[mid] > A[high]){
				low = mid + 1;
			}
		}
		return low;
	}
	
	public static void main(String[] args){
		int[] A = {378, 478, 550, 631, 103, 203, 220, 234};
		System.out.println(searchCyclicalArray(A));
	}
}
