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
                    int n = sc.nextInt();
                    int m = sc.nextInt();
                    int Arr[] = new int[m];
                    for(int i = 0;i<m;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.count(Arr,m,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
    public long count(int S[], int m, int n) {
        long noOfCount = solution(S, m, n ,0);
        return noOfCount;
    } 
    
    long solution(int S[], int m, int n, int currentCoin){

        if(n == 0){
            return 1;
        }
        
        if(n<0){
            return 0;
        }
        
        long count = 0;
        for(int i=currentCoin; i<m; i++){
            if((n - S[i])>=0){
               count +=  solution(S, m, n-S[i], i);
            }
        }
        
        return count;
    }
}
