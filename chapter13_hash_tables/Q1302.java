package chapter13_hash_tables;

import java.util.HashMap;

//Q: Test for palindromic permutations
public class Q1302 {
	
	//idea: hash table to store the key-value, can only have one odd value
	public static boolean canFormPalindrome(String s){
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c: s.toCharArray()){
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}
		int oddValueKey = 0;
		for(Character c: s.toCharArray()){
			if(map.get(c) % 2 != 0)
				oddValueKey ++;
		}
		return oddValueKey > 1? false: true;
	}

}
