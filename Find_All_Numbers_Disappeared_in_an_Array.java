package practice;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
//有效利用index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDisappearedNumbers(nums);
		System.out.print(ans);

	}
public static List<Integer> findDisappearedNumbers(int[] nums) {
	List<Integer> res = new ArrayList<>();
	int n = nums.length;
	for(int i=0;i<n;i++) nums[(nums[i]-1)%n]+=n;
	for(int i=0;i<n;i++) if( nums[i] <= n) res.add(i+1);
	return res;
}
}
