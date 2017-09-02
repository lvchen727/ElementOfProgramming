package chapter16_recurson;

public class EuclideanAlgo {
	
	public static void main(String[] args){
		System.out.println(GCD(24, 156));
	}
	
	// calculate two numbers' greatest common divisorn (GCD)
	//GCD of x and y is the GCD of x and y mod x
	public static int GCD(int a, int b){		
		return b == 0 ? a: GCD(b, a%b);
	}

}
