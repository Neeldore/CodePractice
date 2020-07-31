import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases = Integer.parseInt(br.readLine());
        for (int testCaseCounter = 0; testCaseCounter < numberOfTestCases; testCaseCounter++) {
            String testString = br.readLine();
            System.out.println(testString);
        }
    }

    public static int[] getInteger(String str, int n) {
        String[] strList = str.split("\\s+");
        int[] arrayOfNumber = new int[n];
        for (int i = 0; i < n; i++) {
            arrayOfNumber[i] = Integer.parseInt(strList[i]);
        }
        return arrayOfNumber;
    }

}