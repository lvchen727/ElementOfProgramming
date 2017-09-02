package cahpter7_string;

// integer and string inter-conversion

public class Q0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToString(59999));
		System.out.println(stringToInt2("-100"));
	}
	
	
	//O(n) n:#of digits in n
	public static String intToString(int n){
		String s = "";
		
		if(n == 0)
			return "0";
		
		int sign = 0; // positive
		if (n < 0){
			n = -n;
			sign = -1;
		}
			
		
		while(n != 0){
			int currentInt = n%10;
			char currentChar = (char) ('0' + currentInt);
			s = currentChar + s;
			n = n/10;
		}

		return sign == 0? s: "-" + s;
	
	}
	

	
	public static int stringToInt(String s){
		int n = 0;
		char[] chars = s.toCharArray();
		boolean sign = chars[0] == '-';
		int i = 0;
		int size = chars.length;
		if(sign){
			i = 1;
			size = chars.length - 1;
		}
			
		while(i < chars.length){
			n += (chars[i++] - '0') * Math.pow(10, size - 1);
		}
		
		return size==chars.length? n: -n;
		
	}
	
	public static int stringToInt2(String s){
		char[] chars = s.toCharArray();
		int result = 0, startIndx = 0;
		if(chars[0] == '-'){
			startIndx = 1;
		}
		for(int i = startIndx; i < s.length(); i++){
			result *= 10;
			result += (chars[i] - '0');
		}
		return startIndx == 0? result : -result;
	}

}
