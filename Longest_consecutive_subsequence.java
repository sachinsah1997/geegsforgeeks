// { Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
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

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
        // Map<Integer,Boolean> hMap = new HashMap<>();
        
        // for(int num : arr){
        //     hMap.put(num,false);
        // }
        
        // for(int num : arr){
        //     if(!hMap.containsKey(num-1)){
        //         hMap.put(num, true);
        //     }
        // }
        
        // int count=0;
        // for(int num : arr){
        //     if(hMap.get(num)){
        //         int temp=0;
        //         while(hMap.containsKey(num)){
        //             num++;
        //             temp++;
        //         }
                
        //         if(temp>count){
        //             count=temp;
        //         }
        //     }
        // }
        
        Set<Integer> hSet = new HashSet<>();
        
        for(int num : arr){
            hSet.add(num);
        }
        
        int count=0;
        for(int num : arr){
            if(!hSet.contains(num-1)){
                int temp=0;
                while(hSet.contains(num)){
                    temp++;
                    num++;
                }
                
                if(temp>count){
                    count=temp;
                }
            }
        }
        
        
        return  count;
	}
}
