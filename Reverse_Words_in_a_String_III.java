package practice;

import java.util.Arrays;

public class Reverse_Words_in_a_String_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "Let's take LeetCode contes";
     String ans = reverseWords(s);
     System.out.println(ans);
	}
public static String reverseWords(String s) {
	StringBuilder sb = new StringBuilder();
	String[] s2 = s.split(" ");
	for(String x:s2){
		sb.append(new StringBuilder(x).reverse()).append(" ");
	}
	sb.deleteCharAt(sb.length()-1);
	return(sb.toString());
   }

}
