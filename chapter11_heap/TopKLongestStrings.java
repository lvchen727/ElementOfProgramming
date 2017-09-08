package Chapter11_heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//given a list of strings, return the top k longest strings.
//perfect problem for heap structure where min/max cost O(1) time

public class TopKLongestStrings {
	
	public static List<String> topK(int k, Iterator<String> iter){
		PriorityQueue<String> minHeap = new PriorityQueue<>(k, new Comparator<String>() {
			public int compare(String a, String b){
				return Integer.compare(a.length(), b.length());
			}
		});
		
		while(iter.hasNext()){
			minHeap.add(iter.next());
			if(minHeap.size() > k){
				
				//the comparator function above compare the length
				minHeap.poll();
			}
		}
		
		return new ArrayList<>(minHeap);
		
	}
}
