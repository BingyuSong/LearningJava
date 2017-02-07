package normal_practice;

public class Remove_Element {

	public void main(String[] args) {
		int nums[]={1,2,3,4,3,2,2,2};
		int ans = removeElement(nums,2);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}
public int removeElement(int[] nums, int val) {
        int index = 0;
        int count = 0;
        for(int j=0;j<nums.length;j++){
        	if(nums[j]!=val){
        		nums[index]=nums[j];
        		index++;
        		count++;
        	}
        }
        return count;
    }

}
