import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases = Integer.parseInt(br.readLine());
        for (int testCaseCounter = 0; testCaseCounter < numberOfTestCases; testCaseCounter++) {
            int n = Integer.parseInt(br.readLine());
            int[] nums = { 0, 0, 0 };
            String testString = br.readLine();
            int[] array = getInteger(testString, n);
            for (int i = 0; i < n; i++) {
                if (array[i] == 0)
                    nums[0]++;
                if (array[i] == 1)
                    nums[1]++;
                if (array[i] == 2)
                    nums[2]++;

            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < nums[i]; j++) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
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