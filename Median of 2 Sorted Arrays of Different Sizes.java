// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        int tSize = m+n;
        int sortArr[] = new int[tSize];
        int idx=0;
        
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                sortArr[idx]=a[i];
                i++;
            }else{
                sortArr[idx] = b[j];
                j++;
            }
            idx++;
        }
        
        // if(idx == size){
        //     return (double)sortArr[n+m-1])/2;
        // }
        
        while(i<n){
            sortArr[idx]=a[i];
            i++;
            idx++;
        }
        
        while(j<m){
            sortArr[idx]=b[j];
            j++;
            idx++;
        }
        
        return  (tSize)%2==0? (double)(sortArr[tSize/2]+sortArr[(tSize/2)-1])/2 : (double)sortArr[tSize/2];
    }
}
