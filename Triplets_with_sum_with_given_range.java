// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[] = new int[N];
            for (int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            String[] input = new String[2];
            input = read.readLine().split(" ");
            int L = Integer.parseInt(input[0]);
            int R = Integer.parseInt(input[1]);

            Solution ob = new Solution();
            System.out.println(ob.countTriplets(Arr, N, L, R));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    static int countTriplets(int Arr[], int N, int L, int R) {
        // code here
        Arrays.sort(Arr);
        int count=0;
        for(int i=0; i<N-1; i++){
            
            int sec = i+1;
            int third = N-1;
            
            while(sec<third){
                int sum = Arr[i]+Arr[sec]+Arr[third];
                if(sum<=R){
                    count+=third-sec;
                    sec++;
                }else{
                    third--;
                }
            }
            
            sec = i+1;
            third = N-1;
            
            while(sec<third){
                int sum = Arr[i]+Arr[sec]+Arr[third];
                if(sum<L){
                    count-=third-sec;
                    sec++;
                }else{
                    third--;
                }
            }
            
            
        }
        
        return count;
    }
}
