package chapter17_dynamic_programming;

// 1,1,2,3,5,8....
public class FibonacciNumbers {
	
	
	public static void main(String[] args){
		System.out.println(computeFibonacci2(7));
	}
	
	//DP subproblem: f(n) = f(n-1) + f(n-2)
	//time complexity O(n), space complexity O(1)
	public static int computeFibonacci(int n){
		if( n <= 1){
			return 1;
		}
		int f1 = 1, f2 = 1;
		for(int i = 2; i <n; i++){
			int f = f1 + f2;
			f1 = f2;
			f2 = f;
		}
		return f2;
	}
	
	//recursion
	public static int computeFibonacci2(int n){
		if( n <= 2){
			return 1;
		}
		return computeFibonacci2(n - 1) + computeFibonacci(n-2);
	}
}
