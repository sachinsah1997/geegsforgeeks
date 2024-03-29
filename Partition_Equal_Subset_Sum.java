// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        int arrSum = 0;
        for(int num : arr){
            arrSum+=num;
        }
        
        if(arrSum%2==1){
            return 0;
        }
        
        return subSet(arr, arrSum/2, N);
    }
    
    static int subSet(int arr[], int sum, int N){
        
        int dp[][] = new int[N+1][sum+1];
        
        for(int i=0; i<=N; i++){
            dp[i][0] = 1;
        }
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=sum; j++){
                
                if(arr[i-1]<=j){
                    dp[i][j] = Math.max(dp[i-1][j-arr[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[N][sum];
    }
}
