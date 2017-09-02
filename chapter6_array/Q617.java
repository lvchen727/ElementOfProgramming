package chapter6_array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q: SUDOKU CHECKER
public class Q617 {
	
	public static boolean isValidSoduku(List<List<Integer>> partial_assignment){
		
		int sudokuSize = partial_assignment.size();
		//check for rows
		for(int i = 0;  i < sudokuSize; i++){
			if(hasDuplicate(partial_assignment, i, i+1, 0, sudokuSize))
				return false;
		}
		
		
		//check for columns
		for(int j = 0; j < sudokuSize; j++){
			if(hasDuplicate(partial_assignment, 0, sudokuSize, j, j+1))
				return false;
		}
		
		
		//check for subgraphs
		int numSubs = (int) Math.sqrt(sudokuSize);
		for(int i = 0; i < numSubs; i++){
			for(int j = 0; j < numSubs; j++){
				if(hasDuplicate(partial_assignment, i * numSubs, (i + 1)*numSubs, j * numSubs, (j + 1)*numSubs))
					return false;
			}
		}
		return true;
	}
	
	
	public static boolean hasDuplicate(List<List<Integer>> partial_assignment, int start_row, int end_row, int start_column, int end_column){
		// considerint 1,2,3,..... sudokuSize, if anyone of them appears, there is duplicate
		
		List<Boolean> nums = new ArrayList<>(Collections.nCopies(partial_assignment.size() + 1, false));
		for(int i = start_row; i < end_row; i++){
			for(int j = start_column; j < end_column; j++){
				Integer num = partial_assignment.get(i).get(j);
				if(partial_assignment.get(i).get(j) != 0 && nums.get(partial_assignment.get(i).get(j))){
					return true;
				}
			}
		}
		return false;
	}

}
