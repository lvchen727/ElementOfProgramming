package chapter13_hash_tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//hash table  
//Good data structures for dictionary, i.e. set of strings. could compare with BST/Trie
//JAVA: HashSet/HashTable

//Q: Partition into anagrams
public class Q1301 {

	//1. brute force: O(n^2mlogm)
	
	//2. hashtable: O(nmlogm)
	public static List<List<String>> findAnagrams(List<String> dictionary){
		HashMap<String, List<String>> sortedStringToAnagrams = new HashMap<>();
		for(String s: dictionary){
			char[] sToChars = s.toCharArray();
			String sortedS = new String(sToChars);
			if(!sortedStringToAnagrams.containsKey(sToChars)){
				sortedStringToAnagrams.put(sortedS, new ArrayList<>());
			}
			sortedStringToAnagrams.get(sortedS).add(s);
		}
		
		List<List<String>> result = new ArrayList<>();
		for(Map.Entry<String, List<String>> p: sortedStringToAnagrams.entrySet()){
			result.add(p.getValue());
		}
		
		return result;
	}
}
