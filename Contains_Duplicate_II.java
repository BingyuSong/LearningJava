package practice;

import java.util.Hashtable;

public class Contains_Duplicate_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		boolean ans = containsNearbyDuplicate(nums,0);
		System.out.print(ans);
	}
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Hashtable<Integer,Integer> Myhash = new Hashtable<Integer,Integer>();
		boolean ans = false;
		for(int i=0;i<nums.length;i++){
			if(Myhash.containsKey(nums[i])&& Math.abs((Myhash.get(nums[i])-i))<=k) {
				ans = true;
				break;
			}
			else{
				Myhash.put(nums[i],i );
			}
		}
		return ans; 
    }
}
