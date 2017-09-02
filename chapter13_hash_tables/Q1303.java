package chapter13_hash_tables;

import java.util.HashMap;

//Q: is anonymous letter contructible?
public class Q1303 {
	
	//idea: count the distinct characters appearing in the letter
	public static boolean isLetterConstructibleFromMagzine(String letter, String magazine){
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c: magazine.toCharArray()){
			if(!map.containsKey(c)){
				map.put(c, 0);
			}else{
				map.put(c, map.get(c) + 1);
			}
		}
		
		for(Character c: letter.toCharArray()){
			if(!map.containsKey(c)){
				return false;
			}else {
				map.put(c, map.get(c) - 1);
			}
			if(map.get(c) < 0){
				map.remove(c);
			}
			
		}
		return true;
	}
	

}
