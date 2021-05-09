// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        int arrLength = v.length;
        int low=0,high=arrLength-1;
        int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
    
            if(v[mid] == x){
                idx = mid;
                break;
            }else if(v[low] == x){
                idx = low;
                break;
            }else if(v[high] == x){
                idx = high;
                break;
            }else if(v[mid]>x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
   //     System.out.println(sort);
     
         int first=-1,second=-1;
       
         if(idx != -1){
            first = idx;
            second = idx;
            for(int i=idx; i>=0; i--){
                if(v[i] != x){
                    first = i+1;
                    break;
                }
            }
            
            for(int i=idx; i<arrLength; i++){
                if(v[i] != x){
                    second = i-1;
                    break;
                }
            }
        }
        
        return new pair(first,second);
        
    }
}
