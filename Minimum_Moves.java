package normal_practice;

import java.util.Arrays;

public class Minimum_Moves {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(minMoves(nums));
		// TODO Auto-generated method stub

	}
//其他两个增加和剩下一个减少是互补的过程
	public static int minMoves(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 1)
			return 0;
		int ans = 0;
		for (int i : nums) {
			ans += i - nums[0];
		}
		return ans;
	}
}
