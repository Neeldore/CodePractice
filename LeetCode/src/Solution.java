import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public static void main(String args[]) {
        System.out.println(lengthOfLongestSubstring("au"));

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0)
            return 0;
        int maxLen = 1;
        for (int i = 0; i < chars.length; i++) {
            ArrayList heyo = new ArrayList<>();
            HashSet hs = new HashSet<>();
            int index = 0;
            for (int j = i; j < chars.length; j++) {
                if (heyo.contains(chars[j])) {
                    maxLen = maxLen > heyo.size() ? maxLen : heyo.size();
                    break;
                } else {
                    heyo.add(chars[j]);
                    maxLen = maxLen > heyo.size() ? maxLen : heyo.size();
                }
            }
        }
        maxLen = maxLen == 0 ? chars.length : maxLen;
        return maxLen;
    }

}