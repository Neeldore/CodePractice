import java.io.IOException;

// https://leetcode.com/problems/palindrome-number

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(1221));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int a = 0, initialNum = x;
        while (x > a) {
            a = a * 10 + x % 10;
            x = x / 10;
        }
        if (x == a || x == a / 10)
            return true;
        return false;
    }
}