package normal_practice;

import java.util.Arrays;

public class Maximum_Product_Subarray_nonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,2};
		int ans = maxProduct(nums);
		System.out.println(ans);
	}
	  public static int maxProduct(int[] nums) {
	       if (nums.length==1 ){
	    	   return nums[0];
	       }
	       int max = nums[0];

	       for(int i=0; i<nums.length;i++){
		       int temp =1;
	    	   for(int j=i;j<nums.length;j++){
	    		   temp=temp*nums[j];
	    		   max = Math.max(max, temp);
	    	   }

	       }
	       return max;
	    }

}
