package chapter14_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q: render a calender
//write a program takes a set of events, and determines the maximum number of events that 
public class Q1405 {
	
	//idea: sort the timepoint in ascending order
	//go over the timepoint, if it is a start, increment 1, if it is an end, minus 1.
	//then the maximum number being recorded is maximum number of concurent events
	public static int findMaxOverlap(List<Event> A){
		List<TimePoint> timePoints = new ArrayList<>();
		for(Event e: A){
			timePoints.add(new TimePoint(e.start, true));
			timePoints.add(new TimePoint(e.finish, false));
		}
		Collections.sort(timePoints);
		int maxOverlap = 0;
		int overlap = 0;
		for(int i = 0; i < timePoints.size(); i++){
			if(timePoints.get(i).isStart){
				overlap++;
			}else{
				overlap--;
			}
			if(overlap > maxOverlap)
				maxOverlap = overlap;
		}
		return maxOverlap;
	}
	
	

}

class Event{
	int start;
	int finish;
	public Event(int start, int finish){
		start = this.start;
		finish = this.finish;
	}
}

class TimePoint implements Comparable<TimePoint>{
	int time;
	boolean isStart;
	public TimePoint(int time, boolean isStart){
		this.time = time;
		this.isStart = isStart;
	}
	
	public int compareTo(TimePoint t){
		if(this.time != t.time){
			return Integer.compare(this.time, t.time);
		}else{
			if(this.isStart && !t.isStart){
				return -1;
			}else if(!this.isStart && t.isStart){
				return 1;
			}else{
				return 0;
			}
		}
		
	}
	
}

