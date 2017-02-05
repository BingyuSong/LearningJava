package normal_practice;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3, 3 };
		int target = 6;
		int ans[] = twoSum(nums, target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = nums.length - 1; j > 0; j--) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}

			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}