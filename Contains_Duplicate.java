package practice;

import java.util.Hashtable;

public class Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,3,2,3};
		boolean ans = containsDuplicate(nums);
		System.out.print(ans);
	}
	public static boolean containsDuplicate(int[] nums) {
		Hashtable<Integer,Integer> Myhash = new Hashtable<Integer,Integer>();
		boolean ans = false;
		for(int i : nums){
			if(Myhash.containsKey(i)) {
				ans = true;
				break;
			}
			else{
				Myhash.put(i, 0);
			}
		}
		return ans;
    }
}
