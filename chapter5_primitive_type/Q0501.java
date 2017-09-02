package chapter5_primitive_type;

//bitwise manipulation

//Q: compute parity
// 1 if odd number of 1s, 0 if even number of 1s in word
public class Q0501 {
	public static void main(String[] args) {
		System.out.println(computeParity1(3));
	}

	//O(n)
	public static int computeParity(int n) {
		int parity = 0;
		while(n != 0){
			parity  += (n ^ 1);
			n >>=  1;
		}
		return parity%2;
	}
	
	//O(k), k== #of bits in n
	public static int computeParity1(int n) {
		int parity = 0;
		while(n != 0){
			parity ^= 1;
			n &= (n-1); //replace the lowest bit that is 1 with 0
		}
		return parity;
	}
	
	//O(n/L) grouping the bits into nonoverlapping subwords with length of L: 1. process multiple bits at a time 1. cache the results in loopup table
//	public static int computeParity2(int n) {
//		int kWordSize = 16;
//		int kBitMask = 0xFFFF; 	//0xffff = 0b1111111111111111 So it is 16 bits set to 1
//		return precompute_parity[n >> (3 *kWordSize)] ^
//				precompute_parity[(n >> (2 *kWordSize)) & kBitMask] ^
//				precompute_parity[(n >>  kWordSize) & kBitMask] ^
//				precompute_parity[n  & kBitMask];
//	}

}
