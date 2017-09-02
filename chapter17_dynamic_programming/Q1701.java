package chapter17_dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//DP - dynamic programming
//similar to divide-and-conquer, but DP has the same subproblem
//usually used for optimization problems and counting and decision problems

//Q: count the number of score combos
// individual player score <2,3,7>, if want to reach target scores, how many combos
public class Q1701 {
	
	//DP: using 2D array A[i][j] to represent the number of combos we have to reach score j using W[0...i] score choices
	//subproblem: A[i+1][j] = A[i][j] + A[i][j - W[i+1]] + A[i][j - 2*W[i+1]] + .....
	//                      = A[i][j] (without_this_play)+ A[i+1][j-W[i+1]] (with_this_play)
	//base case: A[i][0] = 1
	//base case for i == 0: without_this_play = 0, with_this_play = j > W[0] ? A[0][j-W[0]]: 0
	//time complexity O(sn) s:target, n:number of individual play score
	public static int NumCombosForFinalScore (List<Integer> individual_play_scores, int target){
		int[][] DP = new int[individual_play_scores.size() ][target + 1];
		
		for(int i = 0; i < individual_play_scores.size(); i++){
			DP[i][0] = 1; // 1 choice for target == 0
		}
		
		for(int i = 0; i < individual_play_scores.size(); i++){
			for(int j = 1; j <= target; j++){
				int without_this_play = i >= 1? DP[i-1][j] : 0;
				int with_this_play = j - individual_play_scores.get(i) >= 0? DP[i][j - individual_play_scores.get(i)] : 0;
				DP[i][j] = without_this_play + with_this_play;
			}
		}
		return DP[individual_play_scores.size()-1][target];
	}
	
	public static void main(String[] args){
		List<Integer> individual_play_scores = new ArrayList<>(Arrays.asList(2,3,7));
		System.out.println(NumCombosForFinalScore(individual_play_scores, 12));
	}

}
