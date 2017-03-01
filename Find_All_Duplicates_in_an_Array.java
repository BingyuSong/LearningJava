package practice;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		for(int i : findDuplicates(nums)){
			System.out.print(i);
		}
		// TODO Auto-generated method stub

	}
//change i-1 position to negative(Make full use of index)
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> res = new ArrayList<>();
		for(int i : nums){
			int index = Math.abs(i)-1;
			if(nums[index]<0){
				res.add(index+1);
			}else{
				nums[index]=-nums[index];
			}

		}return res;
    }
}
