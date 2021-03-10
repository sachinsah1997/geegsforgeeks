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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        
     //   HashSet<Character> hs = new HashSet<>();
        int track[] = new int[26];
        String s = "";
        int length = S.length();
        for(int i=0; i<length; i++){
            if(track[S.charAt(i) - 97] == 0){
                s += S.charAt(i);
            }
            track[S.charAt(i) - 97]++;
        }
        return s;
    }
}
