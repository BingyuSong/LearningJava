package java_practice;

public class Reverse_String_I_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";	
		String ans=reverseStr(str,2);
		System.out.print(ans);

	}
	public static String reverseStr(String s, int k){
		char[] m = s.toCharArray();
		int l = s.length();
		for(int i =0; i<l;i+=(2*k)){
			if(i+k-1>=l){
				reverse(m,i,l-1);
			}else{
				reverse(m,i,i+k-1);
			}
		}return String.valueOf(m);
	}
	public static char[] reverse(char[] m, int i, int l){
		System.out.println(String.valueOf(m));
		while(i<l){
			char temp=m[l];
			m[l]=m[i];
			m[i] = temp;
			i++;
			l--;
		}
		System.out.println(String.valueOf(m));
		return m;
	}

}
