// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends





class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        int count=1;
        
        TreeMap<Integer,Integer> hMap = new TreeMap<>();
        for(int i=0; i<n; i++){
            
            if(hMap.containsKey(end[i])){
             
                int temp = hMap.get(end[i]);
                if(temp < start[i]){
                    hMap.put(end[i],start[i]);
                }
            }else{
                hMap.put(end[i],start[i]);
            }
        }
        
        int lastEnd = -1;
       for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){
           
           if(lastEnd == -1){
               lastEnd = entry.getKey();
           }else if(entry.getValue() > lastEnd){
            //   System.out.println("1");
               lastEnd  = entry.getKey();
               count++;
           }
           //  System.out.println("2");
             
       }
        
        return count;
    }
}
