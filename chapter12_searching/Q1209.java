package chapter12_searching;



import java.util.PriorityQueue;
import java.util.Random;

//Q: find the kth largest element of an array
// assume all entries distinct
public class Q1209 {
	
	//1. brute force: sort the array, then return A[k-1], O(nlogn), O(1)sp, we do not need to sort all array
	
	//2. with min-heap: same as Q1104(compute k closest stars), O(nlogk)t, O(k)sp, just sort the first k
	public static int findKthMax(int[] nums, int k){
		PriorityQueue<Integer> minHep = new PriorityQueue<>(k);
		for(int n: nums){
			minHep.add(n);
			if(minHep.size() > k){
				minHep.remove();
			}
		}
		return minHep.peek();
	}
	
	//3. divide and conquer with randomization
	// randomly choose a pivot, consider number of elements smaller than pivot
	// 1) if > k - 1, just look at them
	// 2) if = k - 1, return pivot
	// 3) if < k - 1, discard them, look at the rest
	// O(n)t, O(1)sp
	public static int findKthMax2(int[] nums, int k){
		int left = 0, right = nums.length - 1;
		Random randomGen = new Random();
		
		while(true){
			int pivotIndex = randomGen.nextInt(right - left + 1) + left;
			int pivot = nums[pivotIndex];
			//partition around pivot using Q601(Dutch flag) unclassified -> bottom, equal, unclassified, top
			// 1) small, swap with smallest
			// 2) equal, not change, increment equal
			// 3) large, swap with last unclassified
			
			System.out.println("left:"+left);
			System.out.println("right:" + right);
			int first_pivot_idx = partition(left, right, pivot, nums);
			// number of elements smaller than pivot == [0...smallest - 1] == smallest
			if(first_pivot_idx == k - 1 ){
				return nums[first_pivot_idx];
			}else if( first_pivot_idx < k - 1){
				left = first_pivot_idx + 1;
			}else{
				right = first_pivot_idx - 1;
			}
			System.out.println("first_pivot_idx:" + first_pivot_idx);
		}
		
	}
	
	// need to partition from large to small
	public static int partition(int left, int right, int pivot, int[] nums){
		int smallest = left, largest = right + 1, equal = left;
		while(equal < largest){
			if(nums[equal] > pivot){
				swap(nums, equal++, smallest++);
			}else if (nums[equal] == pivot){
				++equal;
			}else{
				swap(nums, equal, --largest);
			}
		}
		for(int i : nums){
			System.out.print(i+",");
		}
		System.out.println("");
		
		return smallest;//first pivot index 
	}

	private static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test swap function
		int[] array = {-1,2,0};
		for(int i : array){
			System.out.print(i+",");
		}
		
		System.out.println("");
		
		//test partition
//		System.out.println(partition(0, 3, 1, array));
		System.out.println(findKthMax2(array, 1));
		
	}
	

	

}
