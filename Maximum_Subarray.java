package normal_practice;

import java.util.stream.IntStream;
//当前值大于前面所有值的和时，当前值可替代前面的和
public class Maximum_Subarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = maxSubArray(nums);
		System.out.println(ans);

	}
	public static int maxSubArray(int[] A) {
		int newsum = A[0];
		int max = A[0];
		for (int i = 1; i < A.length; i++) {
			newsum = Math.max(newsum + A[i], A[i]);
			max = Math.max(max, newsum);
		}
		return max;
	}

}
