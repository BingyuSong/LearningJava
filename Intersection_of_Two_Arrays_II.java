package normal_practice;

import java.util.Arrays;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		int[] nums1={4,7,9,7,6,};
		int[] nums2={5,0,0,6,1,6,2,2,4};
		int[] myans = intersection(nums1,nums2);
		for(int i : myans){
			System.out.print(i);
		}
		// TODO Auto-generated method stub

	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int count = 0;
		if (nums1==null||nums2==null){
			return null;}
		int[] ans = new int[Math.min(nums1.length, nums2.length)];

		for(int i=0,j=0;i<nums1.length&&j<nums2.length;){
			if(nums1[i]==nums2[j]){
				ans[count++]=nums1[i];
				j++;
				i++;}
			else if(nums1[i]<nums2[j]){
				i++;
			}else{j++;}		
		}
	int[] result = new int[count];
	for(int k=0;k<count;k++){
		result[k]=ans[k];
	}
	return result;	
	}
}
