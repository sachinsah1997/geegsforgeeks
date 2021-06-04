// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        int k = kadane(a, n);
        
        if(k<0){
            return k;
        }
        
        int sum=0;
        for (int i = 0; i < n; ++i){
            sum+=a[i];
            a[i] = -a[i];
        }
        
        int revSum=kadane(a,n)+sum;
    
        return Integer.max(revSum,k);
    }
    
    static int kadane(int arr[],int num){
        
        int sum=0,maxsum=Integer.MIN_VALUE;
        
        for (int i = 0; i < num; ++i){
            sum+=arr[i];
            maxsum=Math.max(maxsum,sum);
            
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
    
}

