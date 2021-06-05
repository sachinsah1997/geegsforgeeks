// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.math.*;
import java.io.*;

class FastReader{ 
	BufferedReader br; 
	StringTokenizer st; 

	public FastReader(){ 
		br = new BufferedReader(new InputStreamReader(System.in)); 
	} 

	String next(){ 
		while (st == null || !st.hasMoreElements()){ 
			try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
		} 
		return st.nextToken(); 
	} 

	String nextLine(){ 
		String str = ""; 
		try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
		return str; 
	} 
} 

class Gfg
{
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(sc.next());
        while(t-- > 0)
        {
            int k = Integer.parseInt(sc.next());
            String s = sc.next();
            Solution T = new Solution();
            out.println(T.reduced_String(k, s));
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

/*
    Note: Use StringBuilder/StringBuffer class for String concatenation(if any).
    While using String class, on each concatenation a new copy of the string is created, so that 
    the overall complexity is O(n^2) . Fortunately in Java we could solve this with a StringBuffer/StringBuffer, 
    which has O(1) complexity for each append.
*/

class Solution
{
    public static String reduced_String(int k, String s)
    {
        
        if(k==1){
            return "";    
        }
        
        Stack<Character> stack = new Stack<>();
    
        int freq=1;    
        for(char c : s.toCharArray()){
    
            if(!stack.isEmpty() && stack.peek() == c){
                stack.push(c);
                freq++;
                
                if(freq==k){
                    while(freq!=0){
                        stack.pop();
                        freq--;
                    }
                }
            }else{
                stack.push(c);
                freq=1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}
