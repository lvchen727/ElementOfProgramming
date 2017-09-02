package Chapter11_heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

//Q: compute the k closest stars
public class Q1104 {
	
	//use max-heap, suppose we already have k stars store at max-heap
	//consider k+1 star
	// if large or equal, nothing changer
	// if small, we exchange it with max in the heap
	// O(n)t  O(k)sp
	public static List<Star> findClosetKStars(int k, Iterator<Star> stars){
		PriorityQueue<Star> kStars = new PriorityQueue<>(k, Collections.reverseOrder());
		while(stars.hasNext()){
			Star star = stars.next();
			kStars.add(star);
			if(kStars.size() > k){
				kStars.remove();
			}
		}
		List<Star> result = new ArrayList<>(kStars);
		Collections.sort(result); //O(klogk)
		return result;
	}

}

class Star implements Comparable<Star>{
	public double x,y,z;
	public Star(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double distance(){
		return Math.sqrt(x*x + y*y + z*z);
	}
	
	public int compareTo(Star other){
		return Double.compare(this.distance(), other.distance());
	}
}
