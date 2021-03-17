// { Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}



// } Driver Code Ends




class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        
        Stack<Integer> st = new Stack<>();
        st.add(0);
        long ans[] = new long[n];
        
        for(int i=1; i<n; i++){
                 
                while(!st.empty() && arr[st.peek()] < arr[i]){
                    ans[st.pop()] = arr[i];
                }
                
                if(st.empty()){
                    ans[i] = -1;
                }
                
                st.add(i);
        }
        
        while(!st.empty()){
            ans[st.pop()] = -1;
        }
        ans[n-1] = -1;;
        return ans;
    } 
}
