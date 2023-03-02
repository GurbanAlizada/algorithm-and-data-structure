package leetcode;

import java.util.Arrays;

public class LongestSubstring {
    public static void main(String[] args) {

        System.out.println(longestSubstringWithoutRepeatingCharacters("pwwkew"));


    }

    public static int longestSubstringWithoutRepeatingCharacters(String s){

        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLen = 0;
        int start = 0;
        int[] map = new int[256];

        Arrays.fill(map, -1);

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map[c] >= start) {
                start = map[c] + 1;
            }
            map[c] = end;
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;



    }

}
