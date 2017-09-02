package chapter13_hash_tables;

import java.util.LinkedHashMap;
import java.util.Map;

//Q: implement an ISBN Cache
public class Q1304 {
	
	//idea: use LinkedHashMap which preserve the insertion order
	// have to memorize LinkedListMap usage

}

class LRUCache{
	LinkedHashMap<Integer, Integer> isbnToPrice;
	
	LRUCache(final int capacity){
		this.isbnToPrice = new LinkedHashMap<Integer, Integer>(capacity,1.0f, true ){
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e){
				return isbnToPrice.size() > capacity;
			}
		};
	}
	
	public Integer lookup(Integer key){
		if(!isbnToPrice.containsKey(key))
			return null;
		return isbnToPrice.get(key);
	}
	
	//add the value only if key is not present, don't update the key alreadly existed.
	public Integer insert(Integer key, Integer value){
		Integer currentValue = isbnToPrice.get(key);
		if(!isbnToPrice.containsKey(key)){
			isbnToPrice.put(key, value);
			return currentValue;
		}
		return null;
	}
	
}
