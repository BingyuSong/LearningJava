package normal_practice;

public class Search_Insert_Position {

	public static void main(String[] args) {
		int[] nums = { 1, 3 };
		int target = 2;
		int temp = searchInsert(nums, target);
		System.out.println(temp);
		// TODO Auto-generated method stub

	}

	public static int searchInsert(int[] nums, int target) {
		int ans = 0;
		int length = nums.length;
		if (nums[0] >= target) {
			ans = 0;
		} else if (length == 1) {
			ans = 1;
		} else if(nums[length-1]<target){
			ans = length;
		}
		else {
			for (int index = 0; index < nums.length ; index++) {
				if (nums[index] < target && target <= nums[index + 1]) {
					ans = (index + 1);
				}
			}
		}
		return ans;
	}

}
