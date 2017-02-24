package normal_practice;

import java.util.Arrays;

public class Maximum_Product_Subarray {

	public static void main(String[] args) {
		int[] nums={2,3,-2,4};
		int ans = maxProduct(nums);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}
	  public static int maxProduct(int[] nums) {
	       if (nums.length==1 ){
	    	   return nums[0];
	       }
	       int max = nums[0];
	       int temp =1;
	       for(int i=0; i<nums.length;i++){
	    	   temp=temp*nums[i];
	    	   max = Math.max(max, temp);
//	    	   System.out.println(max);
	       }
	       int[] newArray = Arrays.copyOfRange(nums, 1, nums.length);
	       for(int j : newArray){
	    	   System.out.println(j);
	       }
	       return Math.max(max, maxProduct(newArray));
	    }
	  
}
