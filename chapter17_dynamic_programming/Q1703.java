package chapter17_dynamic_programming;

//Q: count the number of ways to traverse a 2D array
public class Q1703 {
	
	//idea: DP -> for each position, it either comes from top or left
	// DP[i][j] = DP[i-1][j] + DP[i][j-1]
	
	//solution 1: O(nm)t, O(nm)sp
	public static int numberOfWays(int n, int m){
		int[][] DP = new int[n][m];
		
		for(int i = 0; i < n; i++){
			DP[i][0] = 1;
		}
		
		for(int j = 0; j < m; j++){
			DP[0][j] = 1;
		}
		
		for(int i = 1; i < n; i++){
			for(int j = 1; j < m; j++){
				DP[i][j] = DP[i-1][j] + DP[i][j-1];
			}
		}
		
		return DP[n-1][m-1];
	}
	
	//solution 2: O(nm)t, O(1)sp
	//use recursion
	public static int numberOfWays2(int n, int m){
		if(n == 1|| m== 1){
			return 1;
		}
		return numberOfWays(n-1, m) + numberOfWays(n, m-1);
	}
	
	public static void main(String[] args){
		System.out.println(numberOfWays2(3, 3));
	}
	

}
