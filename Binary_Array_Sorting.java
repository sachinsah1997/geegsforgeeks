// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n){ 
	    
	    int noOfZero = 0;
	    int noOfOne = 0;
	    
	    for(int num : arr){
	        if(num == 0){
	            noOfZero++;
	        }else{
	            noOfOne++;
	        }
	    }
	    
	   // System.out.println(noOfZero + " " + noOf)
	    int i=0;
	    while(noOfZero>0){
	        arr[i] = 0;
	        i++;
	        noOfZero--;
	    }
	    while(noOfOne>0){
	        arr[i] = 1;
	        i++;
	        noOfOne--;
	    }
	    
	    return arr;
	} 
} 
