package java_practice;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int climbStairs(int n) {
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(n == 2) return 2;
    
    int one_step_before = 2;
    int two_steps_before = 1;
    int all_ways = 0;
    /*
     * 对于第n节台阶而言，他可以从n-1跨上来，也可以从n-2跨上来，但都是唯一的，因为如果n-2这里只跨一步则会变成跨到n-1这个位置
     * 就会和n-1的结果重叠。因此到n的路径就等于到n-1的路径加上到n-2的路径和
     */
    for(int i=2; i<n; i++){
    	all_ways = one_step_before + two_steps_before;
    	two_steps_before = one_step_before;
        one_step_before = all_ways;
    }
    return all_ways;
}

}
