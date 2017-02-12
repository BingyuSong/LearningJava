package normal_practice;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void rotate(int[] nums, int k) {
		if (nums == null ||nums.length==0 || k < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		}
	 //因为reverse nums.length次的时候就回归到原来的状况。
		if(k > nums.length){
			k = k %nums.length;
		}
		int a = nums.length - k; 
	 
		reverse(nums, 0, a-1);
		reverse(nums, a, nums.length-1);
		reverse(nums, 0, nums.length-1);
	 
    }
	public int[] reverse(int[] nums, int start, int end){
		int temp;
		while(start<end){
			temp=nums[start];
			nums[start]=nums[end];
			nums[end] = temp;
			start++;
			end--;
		}return nums;
	}

}
