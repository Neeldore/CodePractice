import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// https://leetcode.com/problems/zigzag-conversion/submissions/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int a[] = { -1, 0, 1, 2, -1, -4 };
        Solution sol = new Solution();
        System.out.println(sol.threeSum(a));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> c = new ArrayList<>();
        int len = nums.length;
        if (len < 3)
            return c;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    c.add(temp);
                    j++;
                    while (j > 0 && j < k && nums[j] == nums[j - 1])
                        j++;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    ++j;
                } else {
                    --k;
                }
            }
        }
        return c;

    }
};