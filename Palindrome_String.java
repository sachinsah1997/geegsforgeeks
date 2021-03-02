// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPlaindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {

    int isPlaindrome(String S) {
        
        int sLength = S.length();
        int j = sLength-1;
        
        for(int i=0; i<sLength/2; i++){
            
            if(!(S.charAt(i) == S.charAt(j))){
                return 0;
            }else{
                j--;
            }
        }
        
        return 1;
        
    }
};
