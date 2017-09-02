package chapter14_sorting;

import java.util.Arrays;

//Q: count the frequencies of characters in a sentence
// "bcdacebe" -> (a,1),(b,2), (c,2)....
public class Q1403 {
	
	public static void countFrequencies(String s){
		char[] a = s.toCharArray();
		Arrays.sort(a);
		
		int currentCount = 1;
		for(int i = 1; i < s.length(); i++){
			if(a[i-1] == a[i]){
				currentCount++;
			}else{
				System.out.print("(" + a[i-1] +","+currentCount +"),");
				currentCount = 1;
			}
		}
		System.out.println("(" + a[a.length-1] +","+currentCount +")");
	}
	
	public static void main(String[] args){
		countFrequencies("bcdacebe");
	}

}
