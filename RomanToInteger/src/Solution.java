import java.io.IOException;

// https://leetcode.com/problems/roman-to-integer/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("MMMXLV"));
    }

    public int romanToInt(String s) {
        int length = s.length();
        char charArray[] = s.toCharArray();
        int total = 0;
        for (int i = 0; i < length; i++) {
            int num = romanizer(charArray[i]);
            if (i > 0) {
                char a = charArray[i - 1];
                if (num == 5 && 'I' == a)
                    total += 3;
                else if (num == 10 && a == 'I') {
                    total += 8;
                } else if (num == 50 && a == 'X') {
                    total += 30;
                } else if (num == 100 && a == 'X') {
                    total += 80;
                } else if (num == 500 && a == 'C') {
                    total += 300;
                } else if (num == 1000 && a == 'C') {
                    total += 800;
                } else {
                    total += num;
                }
            } else
                total += num;
        }
        return total;
    }

    public int romanizer(char a) {
        if (a == 'I')
            return 1;
        else if (a == 'V')
            return 5;
        else if (a == 'X')
            return 10;
        else if (a == 'L')
            return 50;
        else if (a == 'C')
            return 100;
        else if (a == 'D')
            return 500;
        else if (a == 'M')
            return 1000;
        else
            return 0;
    }
}