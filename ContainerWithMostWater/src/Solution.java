import java.io.IOException;

// https://leetcode.com/problems/container-with-most-water

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        int a[] = { 1, 2, 3, 4, 5, 25, 24, 3, 4 };
        System.out.println(sol.maxArea(a));
    }

    public int maxArea(int[] height) {
        int localMax = 0;
        int i = 0;
        int length = height.length;
        if (length == 2) {
            return height[0] > height[1] ? height[1] : height[0];
        }
        int j = length - 1;
        while (i < j) {
            int l = height[i];
            int r = height[j];
            localMax = Math.max(localMax, Math.min(l, r) * (j - i));
            if (l > r) {
                j--;
            } else {
                i++;
            }
        }
        return localMax;
    }

}