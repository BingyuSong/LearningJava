package normal_practice;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String x="((";
		boolean s= isValid(x);
		System.out.println(s);
		
		// TODO Auto-generated method stub

	}
	public static boolean isValid(String s){
		 Stack stack = new Stack<>();
		 for(int i=0; i<s.length();i++){
			 //char temp1=s.charAt(i);
			 if(s.charAt(i)!=')' && s.charAt(i)!=']'&&s.charAt(i)!='}'){
				 stack.push(s.charAt(i));
			 }else{
				 if(stack.empty() || !matchTest((Character) stack.peek(), s.charAt(i))){
					 return false;
				 }else{
					 stack.pop();
				 }
			 }
		 }
		 if (!stack.empty()){
			 return false;
		 }else{
			 return true;
		 }
	}
	public static boolean matchTest(char x, char y){
		 if ((x == '(' &&y == ')')||(x == '[' &&y == ']')||(x == '{' &&y == '}')){
			return true;
		}else{
			return false;
		}
	}
	

}
