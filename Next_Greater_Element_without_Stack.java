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
        
        int maxIndex=n-1;
        
        long[] ans = new long[n];
        ans[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            
            if(arr[i] < arr[i+1]){
                ans[i] = arr[i+1];
            }else if(arr[maxIndex] < arr[i]){
                maxIndex = i;
                ans[i] = -1;
            }else{
                int j = i+2; 
                while(j<=maxIndex){
                    if(arr[j]> arr[i]){
                        ans[i] = arr[j];
                        break;
                    }
                    j++;
                }
            }
        }
        return ans;
    } 
}
