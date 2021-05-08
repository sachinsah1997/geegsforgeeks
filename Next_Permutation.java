// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> nextPermutation(int N, int arr[]){
        
        int tres = 0;
        int idx = -1;
        for(int i=N-1;i>0;i--){
           if(arr[i] > arr[i-1]){
              idx = i;
              break;
           }
        }
        
    
        ArrayList<Integer> ansList = new ArrayList<>();
        
        if(idx == -1){
        
            for(int i=N-1;i>=0;i--){
                ansList.add(arr[i]); 
            }
        }else{
            int greaterThanIdx = idx;
            
            for(int i=idx; i<N; i++){
                if(arr[i]>arr[idx-1] && arr[i]<=arr[greaterThanIdx]){
                    greaterThanIdx = i;
                }
            }
            
            int temp = arr[greaterThanIdx];
            arr[greaterThanIdx] = arr[idx-1];
            arr[idx-1] = temp;
            
            Arrays.sort(arr,idx,N);
            
           for(int i=0;i<N;i++){
                ansList.add(arr[i]); 
            }  
        }
        
       
    
        return ansList;
    }
}
