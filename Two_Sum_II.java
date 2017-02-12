package normal_practice;

//import java.util.Arrays;

public class Two_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-1,0 };
		int target = -1;
		int ans[] = twoSum(nums, target);
		System.out.printf("index1 =%d ,  index = %d ", ans[0],ans[1]);
	}

	public static int[] twoSum(int[] numbers, int target) {
		if (numbers.length == 0 || numbers.length == 1 || numbers[0] > target) {
			throw new IllegalArgumentException("No two sum solution");
		}
		for (int i = 0; i < numbers.length - 1; i++) {
		    if(numbers[i]==0&&numbers[i+1]==0&&target==0){
				return new int[] { i + 1, i+2 };
			}else if(numbers[i]==0&&numbers[i+1]==0) {
			    continue;
			}
			for (int j = i + 1; j < numbers.length; j++) {
				if (target==(numbers[i]+numbers[j])) {
					return new int[] { i + 1, j+1 };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
