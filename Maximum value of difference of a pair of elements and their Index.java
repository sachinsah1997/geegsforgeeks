// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0; i<N; i++)
            {
                arr[i] = Integer.parseInt(S1[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxValue(arr,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int maxValue(int[] arr, int N) {
        
    
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<N; i++){
            min = Math.min(arr[i]+i, min);
            max = Math.max(arr[i]+i, max);
        }
        
        int temp1 = max-min;

        min = arr[N-1];
        max = arr[N-1];
        for(int i=N-2; i>=0; i--){
            min = Math.min(arr[i]+(N-1-i), min);
            max = Math.max(arr[i]+(N-1-i), max);
        }
        
        int temp2 = max-min;
        
        return temp1>temp2 ? temp1 : temp2;
    }
};
