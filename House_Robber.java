package java_practice;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,6,5,8,5,7,8};
		System.out.println(rob(nums));

	}
	public static int rob(int[] nums) {
        if(nums==null) return 0;
       /*
        * 如果我们抢当前房子，说明前面的房子没有抢，所以抢完以后，当前值应该是前面没抢的值
        * 加上当前值
        * 如果我们不抢当前房子，则当前最大值，应该是钱面那个值被抢和不被抢中的最大值
        */
        int noPre = 0;
        int Pre = 0;
        for(int i = 0; i<nums.length;i++){
        	int Current = noPre+nums[i];
        	int noCurrent = Math.max(noPre,Pre);
        	noPre = noCurrent;
        	Pre = Current;
        }return(Math.max(noPre, Pre));
    }
   
}
