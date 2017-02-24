package normal_practice;

import java.util.Arrays;

public class Find_Minimum_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int[] nums={1,2,3,5,6,7};
		int ans =  findMin(nums);
		System.out.print(ans);
		// TODO Auto-generated method stub

	}
    public  static int findMin(int[] nums) {
    	for(int i : nums){System.out.print(i);}
    	System.out.println(nums.length/2);
        if(nums.length==1){
        	return nums[0];
        }
        //int mid = nums.length/2;
        
       // System.out.print(mid);
        int min = 0;
        if(nums[0]<nums[nums.length/2]){
        	min = nums[0];
        	return(Math.min(min,findMin(Arrays.copyOfRange(nums, (nums.length/2), nums.length))));
        }
        else{
        	min = nums[nums.length/2];
        	return (Math.min(min,findMin(Arrays.copyOfRange(nums, 0, (nums.length/2)))));
        }
    }

}
