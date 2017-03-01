package practice;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II {

	public static void main(String[] args) {
		int[] nums = {1,2,4,6};
		System.out.print(minMoves2(nums));
		// TODO Auto-generated method stub

	}
public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
        for(int i : nums){
        	sum+= Math.abs(nums[nums.length/2]-i);
        }
        return sum;
    }

}
