package chapter18_greedy_algo_and_invariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// greedy algorithm: reach local optimum, but may not be global optimum
// invariant: a condition that is true during the excution of a program

//Q: 3-SUM
// not neccessary distinct, can use same value twice or more
public class Q1805 {

	//1. brute-force: O(n3)t, O(1)sp
	
	//2. hash table: key: sum - n1- n2, value: {n1,n2}
	//O(n2)t, O(n)sp
	public static boolean hasThreeSum(List<Integer> nums, int sum){
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.size(); i++){
			for(int j = 0; j < nums.size(); j++){
				int twoSum = nums.get(i) + nums.get(j);
				if(!map.containsKey(sum - twoSum)){
					map.put(sum - twoSum, 0);
				}else{
					map.put(sum - twoSum, map.get(sum - twoSum) + 1);
				}
			}
		}
		
		for(int i = 0; i < nums.size(); i++){
			if(map.containsKey(nums.get(i)))
				return true;
		}
		return false;
	}
	
	//3. sort input -> find A[j] + A[k] = sum - A[i]
	//O(n2logn), O(1)sp
	
	//4. use 2-sum
	//O(n2)t, O(1)sp
	public static boolean hasThreeSum2(List<Integer> nums, int sum){
		Collections.sort(nums); //O(nlogn)
		for(int n: nums){
			return hasTwoSum(nums, sum - n);
		}
		return false;
	}

	//O(n)t, O(1)sp
	public static boolean hasTwoSum(List<Integer> nums, int sum) {
		Collections.sort(nums);
		int i = 0, j = nums.size() - 1;
		while(i <= j){
			if(nums.get(i) + nums.get(j) > sum){
				j--;
			}else if (nums.get(i) + nums.get(j) < sum){
				i++;
			}else{
				return true;
			}
			
		}
		return false;
	}
	
	public static void main(String[] args){
		List<Integer> nums = new ArrayList<>(Arrays.asList(2,8,4,6));
		System.out.println(hasThreeSum2(nums, 14));
	}
	
}
