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
                char[] charArray = testString.toCharArray();
                for(int i = 0 ; i < charArray.length ; i++){
                System.out.println(charArray[i] + recursor(getRestOfTheArray(charArray,i)));
                }
                
            }
        }

        public static char[] getRestOfTheArray(char[] charArray, int position){
            char[] sendThis = new char[charArray.length-1];
            int j = 0;
            for(int i = 0 ; i < charArray.length ; i++){
                if(i != position)
                sendThis[j++] = charArray[i];
            }
            return sendThis;
        }

        public static String recursor(char[] restofit){
            String test = "";
            if(restofit.length == 1 ) return restofit[0]+ "";
            for(int i = 0 ; i < restofit.length ; i++){
                test = restofit[i] + recursor(getRestOfTheArray(restofit, i));
            }
            return test;
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