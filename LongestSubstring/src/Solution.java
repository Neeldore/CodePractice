import java.io.IOException;

class Solution {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println(longestPalindrome("ab"));
    }

    public static String longestPalindrome(String s) {
        int length = s.length();
        if(length == 0 || length == 1 || length == 2) return s;
        String finalSub = s.charAt(0) + "";
        int i = 0;
        int j = length - 1;
        while(j != 1){
            String subString = s.substring(i, j);
            if(isPalindrome(subString) && subString.length() > finalSub.length()){
                finalSub = subString;
            }
            i++;
            if(i == j-1){
                j = j-1;
                i = 0;
            }
        }
        return finalSub;
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        Boolean isPalin = true;
        if (length % 2 == 0) {
            int tillJ = length / 2;
            int tillI = tillJ - 1;
            int i = 0;
            int j = length - 1;
            while (i != tillI && j != tillJ) {
                if (s.charAt(i) != s.charAt(j))
                    isPalin = false;
                i++;
                j--;
            }
        } else {
            int tillI = (int) Math.floor(length / 2);
            int i = 0;
            int j = length - 1;
            while (i != tillI && j != tillI) {
                if (s.charAt(i) != s.charAt(j))
                    isPalin = false;
                i++;
                j--;
            }
        }
        return isPalin;
    }

}