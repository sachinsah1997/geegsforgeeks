// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int K=sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.removeKdigits(S,K));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String removeKdigits(String S, int K)
    {
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : S.toCharArray()){
            
            while(!stack.isEmpty() && (int)stack.peek() > (int)c && K>0){
                stack.pop();
                K--;
            }
            
            if(stack.isEmpty() && c == '0'){
                continue;
            }
            stack.push(c);
        }
        
        while(!stack.isEmpty() && K>0){
            stack.pop();
            K--;
        }
        
        if(stack.isEmpty()){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
    
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
    
        return sb.reverse().toString();
    }
}
