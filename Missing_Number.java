package practice;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
        public int missingNumber(int[] nums) {
            int xor=0; 
            int i;
            for(i=0;i<nums.length;i++){
         	   xor=xor^i^nums[i];
            }return xor^i;
         }
    }

