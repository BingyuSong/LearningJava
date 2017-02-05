package normal_practice;

public class Reverse_Integer {

	public static void main(String[] args) {
		int s = -123;
		int k=reverse(s);
		System.out.println(k);
		// TODO Auto-generated method stub
     
	}
	public static int reverse(int x) {
		long reversedNum = 0;
		long input = x;
		while(input !=0){
			reversedNum=reversedNum*10+input%10;
			input = input/10;
		}
		
		if(reversedNum>2147483647 || reversedNum<-2147483648){
			return 0;
		}
	    return (int)reversedNum;   
	    }

}
