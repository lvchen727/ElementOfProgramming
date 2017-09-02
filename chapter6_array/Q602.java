package chapter6_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Q: increment an arbitrary accurate number by 1
// <1,2,8> -> <1,2,9>
public class Q602 {
	public static List<Integer> increment(List<Integer> input){ 
		int lastDigitIdx = input.size() - 1;
		input.set(lastDigitIdx, input.get(lastDigitIdx) + 1);
		while(lastDigitIdx > 0){
			if(input.get(lastDigitIdx) == 10){
				input.set(lastDigitIdx, 0);
				input.set(lastDigitIdx - 1, input.get(lastDigitIdx - 1) + 1);
				lastDigitIdx--;
			}
			lastDigitIdx--;
		}
		if(input.get(0) == 10){
			input.set(0, 0);
			input.add(0, 0);
		}
		return input;
	}
	
	public static void main(String[] args){
		List<Integer> input = new ArrayList<>(Arrays.asList(1,2,8));
		List<Integer> output = increment(input);
		System.out.println(output.toString());
	}

}
