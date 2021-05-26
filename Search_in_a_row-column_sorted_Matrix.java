// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
         	
			Solution x = new Solution();
			
			if (x.search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 
			t--;
		}
	} 
}// } Driver Code Ends





class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    
	    
	   //O(Nlogn)
	   // int j=0;
	   // for(int i=0; i<n; i++){
	        
	   //     if(x>=matrix[i][j] && x <= matrix[i][m-1]){
	            
	   //         while(j<m){
	   //             if(matrix[i][j] == x){
	   //                 return true;
	   //             }
	                
	   //             if()
	                
	   //             j++;
	   //         }
	   //     }
	   // }
	   // return false;
	   
	   //O(m+n)
	   int i=0,j=m-1;
	   
	   while(i<n && j>=0){
	       
	       if(matrix[i][j] == x){
	           return true;
	       }
	       
	       if(matrix[i][j] < x){
	           i++;
	       }else{
	           j--;
	       }
	   }
	   
	   return false;
	 }
} 
