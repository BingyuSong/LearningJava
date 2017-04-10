package practice;

public class Number_Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num = 5;
     int ans =  findComplement(num);
     System.out.print(ans);
	}
	public static int findComplement(int num) {
		int mask = Integer.highestOneBit(num);
		return(~num & (Integer.highestOneBit(num)-1));
    }
}
