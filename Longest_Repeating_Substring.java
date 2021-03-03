// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int sLength = str.length();
        //StringBuilder revStr = new StringBuilder(str);
        //revStr.reverse();
        
        int i=0,j=0;
        int dp[][] = new int[sLength+1][sLength+1];
        
        for( i=1; i<=sLength; i++){
            for( j=1; j<=sLength; j++){
                
                if(str.charAt(i-1) == str.charAt(j-1) && i!=j){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[sLength][sLength];
    }
}
