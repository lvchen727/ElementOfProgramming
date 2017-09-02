package chapter16_recurson;

import java.util.ArrayList;
import java.util.List;

//Q:Generate all nonattacking placements of Queens.
public class Q1602 {
	
	//idea: fill the board row by row, for each row choose the column to see if there is conflic
	// Depth first search
	// [0] -> [0,0] not ok pop -> [0,1] not ok pop -> [0,2] -> [0,2,0] not ok pop -> [0,2,1] not ok,pop -> [0,2,2] not ok, pop..
	public static List<List<Integer>> NQueens(int n){
		List<Integer> colPlacements = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		solveNQueens(n, 0, colPlacements, result);//start from row 0
		return result;
		
	}
	
	public static void solveNQueens(int n, int row, List<Integer> colPlacements, List<List<Integer>> result){
		if(row == n){
			result.add(new ArrayList<>(colPlacements)); //find the solution
		}else{
			for(int col = 0; col < n ; col++){
				colPlacements.add(col);
				if (isValid(colPlacements)){
					solveNQueens(n , row + 1, colPlacements, result);
				}
				colPlacements.remove(colPlacements.size() - 1); // if not valid, stop the entry
			}
		}
	}

	private static boolean isValid(List<Integer> colPlacements) {
		int rowID = colPlacements.size(); // check if the just placed queen is valid
									      // its location is [rowID][colPlacements.get(rowID)]
		
		for(int i = 0; i < rowID - 1; i++){ // check the just place queen with previous ones
			int difference = Math.abs(colPlacements.get(i) - colPlacements.get(rowID));
			if(difference == 0 || difference == rowID - i){ //0: same column; rowID-i : diagnol
				return false;
			}
		}
		return true;
	}

}
