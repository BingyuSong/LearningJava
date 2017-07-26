package java_practice;

public class Repeated_Substring_Pattern {

	public static void main(String[] args) {
		String s= "ababab";
		System.out.print(repeatedSubstringPattern(s));

	}
	public static boolean repeatedSubstringPattern(String s) {
        if(s.length()==0) return true;
        int l = s.length();
        
        for(int i =l/2;i>0;i--){
        	if(l%i==0){
        		int  m = l/i;
        		String s1 = s.substring(0, i);
        		StringBuilder sb = new StringBuilder();
        		for(int j =0; j<m;j++){
        			sb.append(s1);
        		}
        		if (sb.toString().equals(s)) return true;
        	}
        	
        }return false;

        
    }

}
