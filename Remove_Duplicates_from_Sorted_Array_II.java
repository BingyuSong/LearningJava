package normal_practice;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class Remove_Duplicates_from_Sorted_Array_II {
	public static void main(String[] args) {
		int[] nums={1,1,2,2,2,2,3,3,4,3,3,5};
		System.out.println(removeDuplicates(nums));
		// TODO Auto-generated method stub

	}
public static int removeDuplicates(int[] nums) {
	if(nums.length==0 ||nums==null){
		return 0; 
	}
	if (nums.length==1){
		return 1;
	}
	Arrays.sort(nums);
	
//	array = ArrayUtils.removeElement(array, element)
	for (int i=0,j=1;j<nums.length;j++){
		if (nums[i]==nums[j]){
			if(j-i==1){
				continue;
			}else{
				//i=j;
				nums = ArrayUtils.remove(nums, j--);
				System.out.println(j);
//				for(int k : nums){
//					System.out.print(k);
//				}
				//i=j;
			}
		}else{
			i=j;
		}
	}
//	for(int i : nums){
//		System.out.print(i);
//	}
	return nums.length;
	
    }
}
