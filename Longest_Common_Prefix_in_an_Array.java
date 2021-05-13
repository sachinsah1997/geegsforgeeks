// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        
        String minStr = "";
        int minStrLength = 99999999;
        for(String str : arr){
            if(str.length()<minStrLength){
                minStrLength = str.length();
                minStr = str;
            }
        }
        
        for(String str : arr){
           String ans = "";
             for(int i=0; i<minStr.length(); i++){
                
                if(minStr.charAt(i) == str.charAt(i)) {
                    ans += str.charAt(i);
                }
            }
            minStr = ans;
        }
        
        if(minStr.equals("")){
            return "-1";
        }
        return minStr;
    }
}
