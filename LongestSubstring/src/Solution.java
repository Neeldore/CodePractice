import java.io.IOException;

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0 || length == 1)
            return s;
        boolean[][] dp = new boolean[length][length];
        String finalSub = "";
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                boolean isSame = s.charAt(i) == s.charAt(j);
                dp[j][i] = i - j > 2 ? dp[j + 1][i - 1] && isSame : isSame;

                if (dp[j][i] && i - j + 1 > max) {
                    max = i - j + 1;
                    finalSub = s.substring(j, i + 1);
                }

            }
        }
        return finalSub;
    }
}