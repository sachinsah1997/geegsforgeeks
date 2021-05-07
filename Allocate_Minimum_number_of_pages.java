// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]a,int n,int m){
        
        
        int low=0, high=Arrays.stream(a).sum();
        int ans = 0;
        while(low<=high){
        
            int mid=(low+high)/2;
            if(allocation(&a,mid,m,n)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            
        }
        return ans;
    }
    
    
    static boolean allocation(int []a, int mid, int m, int n){
        
            int studCount=1, sum=0;
            
            for(int i=0; i<n; i++){
                
                if(a[i]>mid){
                    return false;
                }
                
                if(sum+a[i] > mid){
                    studCount++;
                    if(studCount>m){
                        return false;
                    }
                    sum=a[i];
                }else{
                    sum += a[i];
                }
            }
                
            return true;
    }
}
