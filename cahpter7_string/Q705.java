package cahpter7_string;

//Q: test for palindromicity
public class Q705 {
	
	//idea: use two pointers
	public static boolean isPalindrome(String s){
		int i = 0;
		int j = s.length() - 1;
		while(i < j){
			while(!Character.isLetter(s.charAt(i)) && i < j){
				i++;
			}
			while(!Character.isLetter(s.charAt(j)) && i < j){
				j--;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isPalindrome("A man, a plan, a canal, Panama."));
	}

}
