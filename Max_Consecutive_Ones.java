package practice;

import java.util.Arrays;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] nums ={1,1,0,1,1,1};
    int ans = findMaxConsecutiveOnes(nums);
    System.out.print(ans);
    
	}
	public static int findMaxConsecutiveOnes(int[] nums) {
      int result= 0;
      int count = 0;
      for(int i = 0; i < nums.length; i++){
    	  if(nums[i]==1){
    		  count++;
    		  result = Math.max(count, result);
    	  }else    count = 0;
      }
      return result;
    }
}
