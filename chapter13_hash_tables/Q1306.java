package chapter13_hash_tables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//Q: find the nearest repeated entries in an array
//closest pair of entries
public class Q1306 {
	
	public static int findNearestRepetition(List<String> paragraph){
		HashMap<String, Integer> map = new HashMap<>();
		int distance = Integer.MAX_VALUE;
		for(int i = 0; i < paragraph.size(); i++){
			if(!map.containsKey(paragraph.get(i))){
				map.put(paragraph.get(i), i);
			}else{
				int currentDistance = i - map.get(paragraph.get(i));
				if(currentDistance < distance){
					distance = currentDistance;
				}
				map.put(paragraph.get(i), i);
			}
		}
		return distance;
	}
	
	public static void main(String[] args){
		List<String> paragraph = new ArrayList<>(Arrays.asList("All", "work", "and", "no", "play", "makes", "for", "no", "work", "no", "fun", "and", "no", "results"));
		System.out.println(findNearestRepetition(paragraph));
	}
}
