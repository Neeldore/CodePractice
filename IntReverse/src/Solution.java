import java.io.IOException;

// https://leetcode.com/problems/reverse-integer/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        System.out.println(sol.reverse(4321));
    }

    public int reverse(int x) {
        int rev = 0;
        int maxComparator = Integer.MAX_VALUE / 10;
        int minComparator = Integer.MIN_VALUE / 10;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > maxComparator || (rev == maxComparator && pop > 7))
                return 0;
            if (rev < minComparator || (rev == minComparator && pop < -8))
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}