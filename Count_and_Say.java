package normal_practice;

import java.util.ArrayList;
import java.util.List;

public class Count_and_Say {

	public static void main(String[] args) {
		int num = 10;
		String ans = countAndSay(num);
		System.out.println(ans);

	}

	public static String countAndSay(int n) {
		if (n <= 0)
			return null;
	 
		String result = "1";
		int i = 1;
	 
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
	 
		return result;
	    }
}
