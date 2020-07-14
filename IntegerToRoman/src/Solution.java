import java.io.IOException;

// https://leetcode.com/problems/integer-to-roman/submissions/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(58));
    }

    public String intToRoman(int num) {
        if (num < 0)
            return "";
        return romanizer(num);
    }

    public String romanizer(int num) {
        if (num < 4 && num > 0)
            return "I" + romanizer(num - 1);
        else if (num > 5 && num < 9)
            return "V" + romanizer(num - 5);
        else if (num > 10 && num < 40)
            return "X" + romanizer(num - 10);
        else if (num >= 40 && num < 50)
            return "XL" + romanizer(num - 40);
        else if (num > 50 && num < 90)
            return "L" + romanizer(num - 50);
        else if (num >= 90 && num < 100)
            return "XC" + romanizer(num - 90);
        else if (num > 100 && num < 400)
            return "C" + romanizer(num - 100);
        else if (num >= 400 && num < 500)
            return "CD" + romanizer(num - 400);
        else if (num > 500 && num < 900)
            return "D" + romanizer(num - 500);
        else if (num >= 900 && num < 1000)
            return "CM" + romanizer(num - 900);
        else if (num > 1000 && num < 4000)
            return "M" + romanizer(num - 1000);
        else if (num == 0)
            return "";
        else if (num == 1)
            return "I";
        else if (num == 4)
            return "IV";
        else if (num == 40)
            return "XL";
        else if (num == 5)
            return "V";
        else if (num == 9)
            return "IX";
        else if (num == 10)
            return "X";
        else if (num == 50)
            return "L";
        else if (num == 100)
            return "C";
        else if (num == 500)
            return "D";
        else if (num == 1000)
            return "M";
        else if (num % 1000 == 0)
            return "M" + romanizer(num - 1000);
        else if (num % 100 == 0)
            return "C" + romanizer(num - 100);
        else if (num % 10 == 0)
            return "X" + romanizer(num - 10);
        else
            return "";
    }
}