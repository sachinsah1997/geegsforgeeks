// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[] = in.readLine().trim().split("\\s+");
            int mat[][] = new int[9][9];
            for(int i = 0;i < 81;i++)
                mat[i/9][i%9] = Integer.parseInt(s1[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.isValid(mat));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isValid(int mat[][]){
        
        Set<Integer> row = new HashSet<>();
        Map<Integer, HashSet<Integer>> col = new HashMap<>();
        Map<Integer, HashSet<Integer>> box = new HashMap<>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                
                if(mat[i][j] != 0){
                    
                    int boxIdx = (i/3)*3+j/3;
                    //System.out.println(boxIdx);
                   
                   
                    if(!row.add(mat[i][j])){
                        return 0;
                    }
                    
                    if(col.get(j) != null){
                        HashSet<Integer> hSet = col.get(j);
                        if(hSet.add(mat[i][j])){
                           col.put(j,hSet);
                        }else{
                            return 0;
                        }
                    }else{
                        HashSet<Integer> hSet = new HashSet<>();
                        hSet.add(mat[i][j]);
                        col.put(j,hSet);
                    }
                    
                    if(box.get(boxIdx) != null){
                        HashSet<Integer> hSet = box.get(boxIdx);
                        if(hSet.add(mat[i][j])){
                            box.put(boxIdx,hSet);
                        }else{
                            return 0;
                        }
                    }else{
                        HashSet<Integer> hSet = new HashSet<>();
                        hSet.add(mat[i][j]);
                        box.put(boxIdx,hSet);
                    }
                    
                }
            }
        
          row.clear();
        }
        
        return 1;
    }
}
