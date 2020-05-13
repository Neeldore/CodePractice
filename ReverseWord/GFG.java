import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class GFG {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // code
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTestCases = Integer.parseInt(br.readLine());
        for (int testCaseCounter = 0; testCaseCounter < numberOfTestCases; testCaseCounter++) {
            String testString = br.readLine();
            
            String splitStuff[] = testString.split("[.]");
            
            Stack<String> testStack = new Stack<String>();
            for(int i = 0 ; i < splitStuff.length ; i++){
            
                testStack.push(splitStuff[i]);
            }
        
            for(int i = 0 ; i < splitStuff.length ; i++){
                System.out.print(testStack.pop());
                if(i != splitStuff.length-1)
                System.out.print(".");
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