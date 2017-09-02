package chapter5_primitive_type;

//Q: reverse digits: -123 -> -321
public class Q508 {
	
	public static int reverseDigits(int n){
		int result = 0;
		while(n!= 0){
			int newResult = result * 10 + n%10;
			
			// have to deal with overflow problem
			if ((newResult - n%10) / 10 != result){ 
				 return 0; 
			}
			result = newResult;
			
			n = n/10;
		}
		return result;
	}
	
	public static void main(String[] args){
		int test = 1534236469;
		System.out.println(reverseDigits(test));
	}

}
