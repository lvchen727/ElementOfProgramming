package chapter18_greedy_algo_and_invariant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q: The gasup problem
// how to efficient compute the ample city, i.e., start from this city then travel through all the remaining cities without running out of gas
// A<5, 6> , B<6,7> for each pair the first one if gas, the second one is miles to next city
// assume there always exists an ample city
public class Q1807 {
	
	private static final int gallonForDistance = 1; // assume 1 gallon for 20 miles
	
	public static int gasStationProblem(List<Integer> gallons, List<Integer> distances){
		cityWithMinRemaining min = new cityWithMinRemaining(0, 0);
		
		for(int i = 0; i < gallons.size() - 1; i++){
			int remain = gallons.get(i) - distances.get(i)/gallonForDistance;
			if(remain < min.remainingGas){
				min = new cityWithMinRemaining(i+1, remain);
			}
		}
		return min.city;
	}
	
	public static void main(String[] args){
		List<Integer> gases = new ArrayList<>(Arrays.asList(4,6,7,4));
		List<Integer> miles = new ArrayList<>(Arrays.asList(6,5,3,5));// this case should start from second city
		System.out.println(gasStationProblem(gases, miles));
	}

}

class cityWithMinRemaining{
	public int city;
	public int remainingGas;
	public cityWithMinRemaining(int city, int remainingGas){
		this.city = city;
		this.remainingGas = remainingGas;
	}
}
