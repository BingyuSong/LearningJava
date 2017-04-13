package practice;

public class Move_Zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 0, 1, 0, 3, 12 };
		moveZeroes(num);

	}
	// [1,0,0,3,12]

	public static void moveZeroes(int[] nums) {
		int j = 0;
		while (j != nums.length - 1) {
			for (int i = j + 1; i < nums.length; i++) {
				if (nums[j] == 0 && nums[i] != 0) {
					nums[j] = nums[i];
					nums[i] = 0;
				}
			}
			j++;
		}
		for (int k : nums) {
			System.out.print(k);
		}
	}
}
