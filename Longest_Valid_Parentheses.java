// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        
        Stack<Character> stack =  new Stack<>();
        // int count=0;
        // for(char c : S.toCharArray()){
            
        //     // if(c == '('){
        //     //     stack.push(c);
        //     // }else{
        //         if(!stack.isEmpty() && stack.peek() == '(' && c == ')'){
        //             count+=2;
        //             stack.pop();
        //         // }else if(stack.isEmpty()){
        //         //     stack.push(c);
        //         // }
        //     }else{
        //         stack.push(c);
        //     }
        // }
        
        //Time complexity : 
        
        int open=0, close=0;
        int max=0;
        
        for(int i=0; i<S.length(); i++){
            
            if(S.charAt(i) == '('){
                open++;
            }else{
                close++;
            }
            
            if(open == close){
                int len = open+close;
                max = Math.max(len,max);
            }else if(close>open){
                close = open = 0;
            }
        }
        
        close=open=0;
        for(int i=S.length()-1; i>=0; i--){
            
            if(S.charAt(i) == '('){
                open++;
            }else{
                close++;
            }
            
            if(open == close){
                int len = open+close;
                max = Math.max(len,max);
            }else if(open>close){
                close = open = 0;
            }
        }
        
        return max;
    }
}
