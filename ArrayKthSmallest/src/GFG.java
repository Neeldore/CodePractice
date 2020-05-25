    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
import java.util.PriorityQueue;

    class GFG {
        public static void main(String[] args) throws NumberFormatException, IOException {
            // code
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numberOfTestCases = Integer.parseInt(br.readLine());
            for (int testCaseCounter = 0; testCaseCounter < numberOfTestCases; testCaseCounter++) {
                int n= Integer.parseInt(br.readLine());
                String numbers= br.readLine();
                int k= Integer.parseInt(br.readLine());
                int intNumbers[] = getInteger(numbers, n);
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for(int i = 0 ; i < n ; i++){
                    pq.add(intNumbers[i]);
                }
                for(int i = 0 ; i < k-1 ; i++){
                    pq.remove();
                }
                System.out.println(pq.peek());

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