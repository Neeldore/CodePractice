import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/3sum-closest/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Solution sol = new Solution();
        System.out.println(sol.letterCombinations("4"));
    }

    public List<String> letterCombinations(String digits) {
        List<String> rm = new ArrayList<String>();
        Map<String, String[]> a = new HashMap<String, String[]>();
        a.put("1", new String[] {});
        a.put("2", new String[] { "a", "b", "c" });
        a.put("3", new String[] { "d", "e", "f" });
        a.put("4", new String[] { "g", "h", "i" });
        a.put("5", new String[] { "j", "k", "l" });
        a.put("6", new String[] { "m", "n", "o" });
        a.put("7", new String[] { "p", "q", "r", "s" });
        a.put("8", new String[] { "t", "u", "v" });
        a.put("9", new String[] { "w", "x", "y", "z" });
        if (digits.length() <= 0)
            return rm;
        if (digits.length() == 1) {
            String c[] = a.get(digits);
            for (int i = 0; i < c.length; i++) {
                rm.add(c[i]);
            }
            return rm;
        }
        for (int i = 1; i < digits.length(); i++) {
            String letter1 = digits.substring(0, i);
            String letter2 = digits.substring(i, i + 1);
            String[] x = a.get(letter1);
            String[] y = a.get(letter2);
            String[] temper = new String[x.length * y.length];
            int k = 0;
            for (int s = 0; s < x.length; s++)
                for (int d = 0; d < y.length; d++) {
                    temper[k++] = x[s].concat(y[d]);
                    if (i == digits.length() - 1) {
                        rm.add(temper[k - 1]);
                    }
                }
            a.put(letter1.concat(letter2), temper);
        }

        return rm;
    }
};