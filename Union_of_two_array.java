// { Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
		Scanner sc=new Scanner(System.in);
		
		//Taking total count of testcases
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    
		    int n,m;
		    
		    //taking size of array a
		    n=sc.nextInt();
		    
		    //taking size of array b
		    m=sc.nextInt();
		    
		    //Creating 2 array of size n and m
		    int a[]=new int[n];
		    int b[]=new int[m];
		    
		    //inserting elements to array a
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    //inserting elements to array b
		    for(int i=0;i<m;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    
		    //calling doUnion method and printing the results
		    System.out.println(doUnion(a,n,b,m));
		}
		
	}

 // } Driver Code Ends


//User function Template for Java

public static int doUnion(int a[], int n, int b[], int m) 
{
    HashSet<Integer> al = new HashSet<>();
    
    for(int i=0; i<n; i++){
            al.add(a[i]);
    }
    
    for(int i=0; i<m; i++){
        
        if(!al.contains(b[i])){
            al.add(b[i]);
        }
    }
    
    return al.size();
    
}


// { Driver Code Starts.


    
}  // } Driver Code Ends
