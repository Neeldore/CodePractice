import java.io.IOException;

// https://leetcode.com/problems/zigzag-conversion/submissions/

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println(convert("PAYPALISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        String stringArray[] = new String[numRows];
        int len = s.length();
        if (len == 0 || len == 1 || numRows == 0)
            return s;

        int doWhat = 1;
        int j = 0;
        for (int i = 0; i < numRows; i++) {
            stringArray[i] = "";
        }
        for (int i = 0; i < len; i++) {
            int yo = j % numRows;
            if (yo == numRows - 1) {
                doWhat = -1;
            } else if (j == 0) {
                doWhat = 1;
            }
            j = j + doWhat;
            String temp = stringArray[yo];
            stringArray[yo] = temp.concat("" + s.charAt(i));
        }
        String toReturn = "";
        for (int i = 0; i < numRows; i++) {
            toReturn = toReturn.concat(stringArray[i]);
        }

        return toReturn;
    }
}