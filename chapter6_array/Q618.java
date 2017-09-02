package chapter6_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q: compute the spiral ordering of 2D array
public class Q618 {
	
	//nxn -> (n-2)x(n-2) -> (n-4)x(n-4)
	//offset : [0...ceil(0.5*size)]
	public static List<Integer> spiralOrder(List<List<Integer>> A){
		List<Integer> result = new ArrayList<>();
		for(int offset = 0; offset < Math.ceil(0.5 * A.size()); offset++){
			eachCycle(offset, result, A);
		}
		return result;
	}
	
	public static void eachCycle(int offset, List<Integer> result, List<List<Integer>> A){
		//base case for odd layer
		if(offset == A.size() - offset - 1){
			result.add(A.get(offset).get(offset));
		}
		
		//loop1: ------>
		for(int i = offset; i < A.size() - offset - 1; i++){
			result.add(A.get(offset).get(i));
		}
		
		//loop2: |
		//       |
		//       |
		//       v
		for(int j = offset; j < A.size() - offset - 1; j++){
			result.add(A.get(j).get(A.size() - offset - 1));
		}
		
		//loop3: <---------
		for(int i = A.size() - offset - 1; i > offset; i--){
			result.add(A.get(A.size()-offset-1).get(i));
		}
		
		
		//loop4: ^
		//       |
	    //       |
		//       |	
		for(int j = A.size() - offset - 1; j > offset; j--){
			result.add(A.get(j).get(offset));
		}
	}
	
	public static void main(String[] args){
		List<List<Integer>> A = new ArrayList<>();
		A.add(Arrays.asList(1,2,3));
		A.add(Arrays.asList(4,5,6));
		A.add(Arrays.asList(7,8,9));
		List<Integer> result = spiralOrder(A);	
		System.out.println(result.toString());
	}

}
