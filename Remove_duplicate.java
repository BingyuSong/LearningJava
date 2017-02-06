package normal_practice;

//import java.util.Hashtable;
//import java.util.Set;

//import org.apache.commons.lang.ArrayUtils;

public class Remove_duplicate {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2, 3, 4, 5 };
		int s = removeDuplicates(nums);
		System.out.println(s);
		// TODO Auto-generated method stub

	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

}
