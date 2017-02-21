package normal_practice;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 此类问题有两种数据可能，A是第一个数比中间数小，B是经过转换后第一个数比中间数大
	// 当第一个数比中间数小的时候，判断target是否大于第一个数且小于中间数， 必须同时满足，因为这种情况下中间数左边的数一定比中间小
	// 当第一个数比中间数小时，中间数右边当数一定比中间数大
	public int search(int[] nums, int target) {
		if (nums.length == 0 || nums == null) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		int mid;
		// 先判断第一个数比中间数大还是小
		while (start + 1 < end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[start] < nums[mid]) {
				if (nums[start] <= target && target <= nums[mid]) {
					end = mid;
				} else {
					start = mid;
				}
			} else {
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid;
				} else {
					end = mid;
				}
			}
		}
		if (nums[start] == target) {
			return start;
		} else if (nums[end] == target) {
			return end;
		}
		return -1;
	}
}
