package chapter17_dynamic_programming;

public class MaximumSubarraySum {
	
	//1. There are n(n+1)/2 subarrays [considering n choice of start and n choice of end]
	//    brute force: O(n3), each subarray takes O(n) to compute
	
	//2. DP subproblem: for each position j in array, 
	//the maximum subarray sum for j is SUM[j] - min(SUM[k]) (k in then range [0 j])
	public static int findMaxSubArray(int[] A){
		
		if(A.length < 1)
			return 0;

		int sum = A[0];
		int minSum = sum;
		int maxSum = sum;
		for(int i = 1; i < A.length; i++){
			sum += A[i];
			if(minSum > sum){
				minSum = sum;
			}
			if(sum - minSum > maxSum){
				maxSum = sum - minSum;
			}
				
		}
		return maxSum;
	}
	
	public static void main(String[] args){
		int[] A = {523, 12, -345, 600};
		System.out.println(findMaxSubArray(A));
	}

}
