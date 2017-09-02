package Chapter11_heap;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//merge sorted files: <3,5,7> , <0,6>, <0,6,28> -> <0,0,3,5,6,6,7,28>

public class A1101 {
	
	//1. brute force: concatenate, then sort 
	//time complexity O(nlog(n))  total of n numbers
	
	//2. take advantage of sort: 3 arrays -> 3 elements in minHeap -> extra/insert log(k) time complexity (k=3 this case) 
	//time complexity O(nlog(k))
	
	// The element of minHeap is arrayEntry
	// have to use arrayEntry to specific the number and which array it is coming from
	public static List<Integer> mergeSortedArrays(List<List<Integer>> sortedArrays){
		
		List<Iterator<Integer>> iters = new ArrayList<>(sortedArrays.size());
		for(List<Integer> array: sortedArrays){
			iters.add(array.iterator());
		}
		
		PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>((int)(sortedArrays.size()), new Comparator<ArrayEntry>(){
			public int compare(ArrayEntry a1, ArrayEntry a2){
				return Integer.compare(a1.number, a2.number);
			}
		});
		
		for(int i = 0; i < iters.size(); i++){
			minHeap.add(new ArrayEntry(iters.get(i).next(), i));
		}
		
		List<Integer> result = new ArrayList<>();
		while(minHeap.size() > 0){
			ArrayEntry currentPopedEntry = minHeap.poll(); 
			result.add(currentPopedEntry.number);
			if(iters.get(currentPopedEntry.arrayID).hasNext()){
				minHeap.add(new ArrayEntry(iters.get(currentPopedEntry.arrayID).next(), currentPopedEntry.arrayID));
			}
		}
		return result;
	}
	
	
}

class ArrayEntry{
	public Integer number;
	public Integer arrayID;
	
	public ArrayEntry(Integer number, Integer arrayID){
		this.arrayID = arrayID;
		this.number = number;
	}
}
