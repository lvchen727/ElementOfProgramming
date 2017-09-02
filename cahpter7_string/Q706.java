package cahpter7_string;

//Q: reverse all the words in a sentence
//Alice likes Bob -> Bob likes Alice
public class Q706 {
	
	//idea: reverse the string, then reverse each word again
	public static String reverseString(String s){
		char[] input = s.toCharArray();
		reverse(input, 0, s.length()-1);
//		System.out.println(new String(input));
		
		int start = 0;
		while(find(input, start,' ') != -1){
			int end = find(input, start, ' ') - 1;
//			System.out.println(end);
			reverse(input, start, end);
			start = find(input, start, ' ') + 1;
		}
		//reverse the last word
		if(start < s.length() -1)
			reverse(input, start, s.length() - 1);
		return new String(input);
	}
	
	
	public static void reverse(char[] input, int start, int end){
		//using swap for inplace
		int i = start, j = end;
		while(i < j){
			char temp = input[i];
			input[i++] = input[j];
			input[j--] = temp;
		}
	}
	
	public static int find(char[] input, int start, char c){
		for(int i = start; i < input.length; i++){
			if(input[i] == c){
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args){ 

		
		//test reverse
		char[] t = "acd ".toCharArray();
		reverse(t, 0,2);
		System.out.println(t);
		
		//test find
		System.out.println(find(t, 3, ' ' ));
		System.out.println(reverseString("Alice likes Bob"));
	}
	
}
