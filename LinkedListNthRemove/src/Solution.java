import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/container-with-most-water

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        int a[] = { -1, -5, -5, -3, 2, 5, 0, 4 };

        System.out.println(sol.fourSum(a, -7));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 4) {
            return a;
        }
        for (int i = 0; i < len - 2; i++) {
            int j = i + 1;
            if (i > 0 && i < len - 2 && nums[i] == nums[i + 1]) {
                i++;
            }
            for (; j < len - 1; j++) {
                int k = j + 1;

                if (i < len - 1 && nums[j] == nums[j + 1]) {
                    j++;
                }
                int l = len - 1;
                while (k < l) {

                    if (nums[i] + nums[k] + nums[j] + nums[l] == target) {
                        List<Integer> x = new ArrayList<>();
                        x.add(nums[i]);
                        x.add(nums[j]);
                        x.add(nums[k]);
                        x.add(nums[l]);
                        a.add(x);
                        k++;
                        l--;
                    } else if (nums[i] + nums[k] + nums[j] + nums[l] < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return a;

    }

}