import java.io.IOException;

// https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        System.out.println(sol.myAtoi("-2147483647"));
    }

    public int myAtoi(String str) {
        int startingIndex = 0;
        int length = str.length();
        int endingIndex = length - 1;
        int returnThis = 0;
        int maxComparator = Integer.MAX_VALUE / 10;
        int minComparator = Integer.MIN_VALUE / 10;
        if (length <= 0)
            return returnThis;
        for (int i = 0; i < length && str.charAt(i) == ' '; i++) {
            startingIndex++;
        }
        for (int i = length - 1; i >= 0 && str.charAt(i) == ' '; i--) {
            endingIndex--;
        }
        if (endingIndex - startingIndex < 0)
            return 0;
        String actualString = str.substring(startingIndex, endingIndex + 1);
        int actualLen = actualString.length();
        if (actualLen <= 0 || actualLen == 1 && (actualString.charAt(0) == '-' || actualString.charAt(0) == '+'))
            return 0;
        int startHere = actualString.charAt(0) == '-' || actualString.charAt(0) == '+' ? 1 : 0;
        int isMinus = actualString.charAt(0) == '-' ? -1 : 1;
        if (actualString.charAt(startHere) < 48 || actualString.charAt(startHere) > 57)
            return 0;
        for (int i = startHere; i < actualLen; i++) {
            int temp = (int) actualString.charAt(i);
            if (temp > 47 && temp < 58) {
                int num = temp - 48;
                if (isMinus * returnThis < minComparator || (isMinus * returnThis == minComparator && num > 8)) {
                    return Integer.MIN_VALUE;
                }
                if (isMinus * returnThis > maxComparator || (isMinus * returnThis == maxComparator && num > 7)) {
                    return Integer.MAX_VALUE;
                }
                returnThis = returnThis * 10 + num;
            } else {
                break;
            }

        }
        if (startHere == 1) {
            if (actualString.charAt(0) == '+')
                return returnThis;
            else
                return returnThis * -1;
        }
        return returnThis;
    }
}