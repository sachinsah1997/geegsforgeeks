// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int target = sc.nextInt();
        	int[] array = new int[n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.threeSumClosest(array,target));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int threeSumClosest(int[] array, int target)  
	{ 
        Arrays.sort(array);
        
        int closeSum = array[0]+ array[array.length-2] + array[array.length-1];
        for(int i=0; i<array.length-1; i++){
            
            int j = i+1;
            int k = array.length-1;
            
            while(j<k){
                
                int sum = array[i] + array[j] + array[k];
                
                if(sum == target){
                    return sum;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
                
                if(Math.abs(sum-target) == Math.abs(closeSum-target)){
                    closeSum = Math.max(closeSum,sum);
                }else if(Math.abs(sum-target) < Math.abs(closeSum-target)) {
                    closeSum = sum;
                }
            }
        }
        
        return closeSum;
	} 
} 
