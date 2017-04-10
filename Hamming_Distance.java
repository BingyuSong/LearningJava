package practice;

public class Hamming_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.toBinaryString(124));
		int x = 1;
		int y = 4;
		int ans = hammingDistance(x,y);
		System.out.println(ans);
	}
	public static int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
//	return(count);
}
