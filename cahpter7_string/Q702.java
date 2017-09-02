package cahpter7_string;

//Q: base conversion
//input is a string represented in base b1, output the string represented in b2
public class Q702 {

	
	//convert to base 10 in number , then convert to b2 in string
	public static String convertBase(int b1, int b2, String s){
		int number = 0;
		char[] chars = s.toCharArray();
		int start = chars[0] == '-' ? 1: 0;
		while(start < s.length()){
			number *= b1;
			number += isDigit(chars[start])? chars[start] - '0' : chars[start] - 'A' + 10;
			start ++;
		}
		
		System.out.println(number);
		
		String output = "";
		
		while(number % b2 != 0){
			int currentDigit = number%b2;
			char currentChar = (char) (currentDigit > 10 ? 'A'+currentDigit - 10 : '0' + currentDigit) ;
			output = currentChar + output;
			number = (number - currentDigit)/b2 ;
		}
		
		return output;
	}
	
	public static boolean isDigit(char x){
		return x -'0'>=0 && x-'0' <=10;
	}
	
	public static void main(String[] args){
		System.out.println(convertBase(10, 10, "123"));
	}

}
