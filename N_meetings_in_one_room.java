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




class Solution {
    public static int maxMeetings(int start[], int end[], int n) {
     
        HashMap<Integer,Integer> hMap = new HashMap<>();
        
        
        int length = start.length;
        for(int i=0; i<length; i++){
            if(hMap.containsKey(new Integer(start[i]))){
                int tmp = hMap.get(start[i]);
                if(tmp>end[i]){
                    hMap.put(start[i], end[i]);
                }
            }else{
                hMap.put(start[i],end[i]);
            }
        }
    
        int[] ordinal = { 0,0};
        hMap.entrySet().stream().sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> {
                 
                      //  System.out.println(k);
                        if(k.getKey()>ordinal[1]){
                            ++ordinal[0];
                            ordinal[1] = k.getValue();
                        }
                });
                
        // Collections.sort(hMap, new Comparator<Map.Entry<Integer,Integer>>(){
        //         public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
        //             return (o1.getValue().compareTo(o2.getValue()));
        //         }
        // });
        
        // int count=1, last=end[0];
        // for(int i=1; i<length; i++){
            
        //         if(start[i] > last){
        //             count++;
        //             last=end[i];
        //         }
        // }
        
        return ordinal[0];
    }
}
