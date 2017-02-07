package normal_practice;

public class Implement_str {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "bc";
        int x = strStr(haystack, needle);
        System.out.print(x);

    }

    public static int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }
        
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            // finished loop, target found
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
    }
}
