package java_practice;

public class Reverse_String_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		
		String ans=reverseStr(str,3);
		System.out.print(ans);
		
	}
	public static String reverseStr(String s, int k){
		StringBuilder MyStringBuilder = new StringBuilder();
		int l=s.length();
		for(int i=0;i<l;){
			if(l-i<k){
				MyStringBuilder.append(reverse(s.substring(i, l)));
				break;
			}else if (k<=l-i && l-i<2*k){
				MyStringBuilder.append(reverse(s.substring(i, i+k)));
				MyStringBuilder.append(s.substring(i+k, l));
				break;
			}else{
				MyStringBuilder.append(reverse(s.substring(i, i+k)));
				MyStringBuilder.append(s.substring(i+k, i+2*k));
				i+=2*k;
			}
				
		}return(MyStringBuilder.toString());
	}
	public static String reverse(String s){
		System.out.println(s);
		char[] array = s.toCharArray();
		String reverse="";
		for(int i=array.length-1;i>=0;i--){
			reverse +=array[i];
		}
		return reverse;
		
	}

}
