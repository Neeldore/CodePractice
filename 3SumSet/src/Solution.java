import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/3sum-closest/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int a[] = { 1, 2, 4, 8, 16, 32, 64, 128 };

        Solution sol = new Solution();
        System.out.println(sol.threeSumClosest(a, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        if (len < 3)
            return 0;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int globalDiff = Math.abs(closest - target);
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];
                if (Math.abs(total - target) <= globalDiff) {
                    globalDiff = Math.abs(total - target);
                    closest = total;
                }
                if (total < target)
                    j++;
                else
                    k--;

            }
        }
        return closest;
    }
};