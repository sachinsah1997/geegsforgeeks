// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
	public static void main(String args[]) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
		while(t>0)
		{
		    int N = sc.nextInt();
		    int P = sc.nextInt();
		    int prerequisites[][] = new int[P][2];
		    for(int i=0;i<P;i++)
		    {
		        for(int j=0;j<2;j++)
		        {
		            prerequisites[i][j] = sc.nextInt();
		        }
		    }
			Solution ob = new Solution();
			if(ob.isPossible(N,prerequisites))
			{
			    System.out.println("Yes");
			}
			else{
			    System.out.println("No");
			}
			t--;
		}
	}
	
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public boolean isPossible(int N, int[][] prerequisites)
    {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        int inOrder[] = new int[N];
        
        for(int i=0;i<N;i++){
            list.add(new ArrayList<Integer>());
        }
        
        int arrLength = prerequisites.length; 
        for(int i=0;i<arrLength;i++){
            list.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inOrder[prerequisites[i][0]]++;
        
        }
        
        int lSize = list.size();
        
        
        //int topo[] = new int[N];
        
       // int rowLength = prerequisites[0].length();
        
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<N; i++){
            if(inOrder[i] == 0){
                queue.add(i);
            }
        }
        
        int t = 0;
        while(!queue.isEmpty()){
            
            int v = queue.poll();
                for(int tempV : list.get(v)){
                        inOrder[tempV]--;
                        if(inOrder[tempV] == 0){
                            queue.add(tempV);
                        }
                }
            t++;
        }
      //  System.out.println(t);
        
        return t==N;
    }
    
}
