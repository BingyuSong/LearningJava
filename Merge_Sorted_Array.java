package normal_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] numsA=new int[11];
		numsA[0]=1;
		numsA[1]=3;
		numsA[2]=4;
		numsA[3]=6;
		numsA[4]=8;
		int[] numsB = {0,2,5,7,9};
		merge(numsA,5,numsB,5);
		
	
		

	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	for(int i:nums1){
			System.out.print(i);
		}
		
    }

}
