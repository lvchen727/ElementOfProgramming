package cahpter7_string;

//Q: replace and move the specific char in array with something else
// remove all 'b' and replace all 'a' with 2 'd'.
// suppose enough room in the original array for replacement

public class Q0704 {
	
	//using forward algo for remove, once we find b, skip it!
	//using backward algo for replace, start from end, if the char is not 'a'. move it to the last available, if 'a', replace with 2'd'
	public static void replaceAndMove(char[] A, int size){//size represent original array size
		
		//foward
		//record writeIndex!!!!
		int writeIndex = 0;
		int countA = 0;
		for(int i = 0; i < size; i++){
			if(A[i] != 'b'){
				A[writeIndex++] = A[i];
			}
			if(A[i] == 'a'){
				countA++;
			}
		}
		
		//backward
		int currentIndex = writeIndex - 1;
		int finalIndex = currentIndex + countA;
		while(finalIndex >= 0){
			if(A[currentIndex] != 'a'){
				A[finalIndex--] = A[currentIndex--];
			}else{
				A[finalIndex--] = 'd';
				A[finalIndex--] = 'd';
				currentIndex--;
			}
		}
	}
	
	
	public static void main(String[] args){
		char[] A  = {'a','c','d','b','b', 'c','a',' ',' ',' ',' ',' ',' '};
		replaceAndMove(A, 7);
		System.out.println(new String(A));
		
	}
}
