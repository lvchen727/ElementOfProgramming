package chapter14_sorting;

//Q: mergesort in-place, assume the first array have enough space for merging the second one
public class Q1402 {
	
	//idea: fill the first array from the end by comparing two arrays simultaneously
	//assume A.length() > B.length()
	public static void mergeTwoSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        int writeIdx = n + m - 1;
        int i = m -1;
        int j = n -1;
        while(writeIdx >= 0){
            if(i < 0){
                nums1[writeIdx--] =nums2[j--];
            }else if(j < 0){
                nums1[writeIdx--] = nums1[i--];
            }else{
                nums1[writeIdx--] = nums1[i] > nums2[j]? nums1[i--]: nums2[j--];
            }
        }
    }
	
	
	public static void main(String[] args){
		int[] A = new int[1];
		int[] B = new int[0];
		mergeTwoSortedArrays(A,1, B,0);
		for(int i : A){
			System.out.print(i +',');
		}
		
	}
}
