package chapter17_dynamic_programming;


//compute the levenshtein distance
public class Q1702 {
	
	// idea: dynamic programming, compare the two string from back to front
	// if the characters are the same, just skip
	// if not same, consider three conditions
	public static int LevenshteinDistance(String a, String b){
		int[][] distanceBetweenPrefixes = new int[a.length()][b.length()];
		
		//initialize dp matrix
		for(int i = 0 ; i < distanceBetweenPrefixes.length; i++){
			for(int j = 0 ; j < distanceBetweenPrefixes[i].length; j++){
				distanceBetweenPrefixes[i][j] = -1;
			}
		}
		int aIdx = a.length() - 1;
		int bIdx = b.length() - 1;
		return computeDistanceBetweenPrefix(a, b, aIdx, bIdx, distanceBetweenPrefixes);
	}
	
	private static int computeDistanceBetweenPrefix(String a, String b, int aIdx, int bIdx, int[][] distanceBetweenPrefixes) {
		
		if(aIdx < 0){ // a is empty
			return bIdx + 1;
		}
		if(bIdx < 0){// b is empty
			return aIdx + 1;
		}
		if( distanceBetweenPrefixes[aIdx][bIdx] == -1){
			if(a.charAt(aIdx) == b.charAt(bIdx)){
				distanceBetweenPrefixes[aIdx][bIdx] =  computeDistanceBetweenPrefix(a, b, aIdx - 1, bIdx - 1, distanceBetweenPrefixes);
			}else{
				int replace = 1 + computeDistanceBetweenPrefix(a, b, aIdx - 1, bIdx - 1, distanceBetweenPrefixes);
				int insert = 1 + computeDistanceBetweenPrefix(a, b, aIdx - 1, bIdx, distanceBetweenPrefixes);
				int delete = 1 + computeDistanceBetweenPrefix(a, b, aIdx, bIdx - 1, distanceBetweenPrefixes);
				distanceBetweenPrefixes[aIdx][bIdx] = Math.min(replace, Math.min(insert, delete));
			}
		}
		return distanceBetweenPrefixes[aIdx][bIdx];
	}


}
