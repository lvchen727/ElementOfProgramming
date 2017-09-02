package chapter12_searching;

//Q: compute the integer square root
public class Q1205 {
	
	//use binary search
	public static int sqrt(int n){
		int low = 0, high = n;
		while(low < high){
			int mid = low + (high - low)/2;
			long mid_squqred = mid * mid;
			if( mid_squqred < n){
				low = mid + 1;
			}else if(mid_squqred > n){
				high = mid - 1;
			}else{
				return mid;
			}
		}
		return low - 1;
	}

}
