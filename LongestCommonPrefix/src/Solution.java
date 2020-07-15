import java.io.IOException;

// https://leetcode.com/problems/longest-common-prefix/submissions/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        String str[] = { "c", "acc", "ccc" };
        System.out.println(sol.longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len <= 0)
            return "";
        if (len == 1)
            return strs[0];
        int minLength = strs[0].length();
        int index = 0;
        for (int i = 0; i < len; i++) {
            int temp = strs[i].length();
            if (temp < minLength) {
                index = i;
                minLength = temp;
            }
        }
        String toBeComparedTo = strs[index];
        char finalArray[] = new char[minLength];
        for (int i = 0; i < len; i++) {
            String str = strs[i];
            for (int j = 0; j < minLength && i != index; j++) {
                char ch = str.charAt(j);
                if (ch == toBeComparedTo.charAt(j) && finalArray[j] != ' ')
                    finalArray[j] = ch;
                else {
                    finalArray[j] = ' ';
                }
            }
        }
        StringBuilder sb = new StringBuilder(minLength);
        String returnThis = "";
        for (int i = 0; i < minLength; i++) {
            if (finalArray[i] == ' ') {
                returnThis = sb.toString();
                break;
            }
            sb.append(finalArray[i]);
        }
        return sb.toString();
    }
}