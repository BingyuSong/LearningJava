package practice;

public class Minimum_Size_Subarray_Sum {

	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		int ans = minSubArrayLen(7,nums);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}
public static int minSubArrayLen(int s, int[] nums) {
	 int sum =0;
     int ans = Integer.MAX_VALUE;
     int j=0;
     for(int i =0;i<nums.length;i++){
    	 while(j<nums.length && sum<s){
    		 sum += nums[j];
    		 j++;
    	 }
    	 if(sum>=s){
    		 ans = Math.min(ans, j-i);
    	 }
    	 sum -= nums[i];// 可以避免j 总是从i的下一个开始跑的重复情况
     }
     if(ans == Integer.MAX_VALUE){
    	 ans = 0;
     }
     return ans;
    }
}
