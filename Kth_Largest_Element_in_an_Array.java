package practice;
import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		int[] nums = {1};
		int ans = findKthLargest(nums,1);
		System.out.print(ans);
		// TODO Auto-generated method stub

	}
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return(nums[nums.length-k]);
    }
}
