package chapter5_primitive_type;

//Q: x^y
public class Q0507 {
	
	//bit manipulation:
	// 1. if y bit ends with 1, x = x * (x^(y/2))^2
	// 2. if y bit ends with 0: x = (x^(y/2))^2
	// two cases: 1. current bit of y is 1: result *= x, x *= x  2. current bit of y is 0: x *= x
	
	public static double power(double x, int y){
		if(y < 0){
			x = 1.0/ x;
			y = -y;
		}
		
		double result = 1;
		while(y > 0){
			if((y & 1) != 0){
				result *= x;
			}
			x *= x;
			y >>= 1;
		}
		
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(power(2.5, 2));
	}
	
}
