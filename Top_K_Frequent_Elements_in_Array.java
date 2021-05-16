// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public int[] topK(int[] nums, int k) {
    
        
        HashMap<Integer,Integer> hMap = new HashMap<>();
        
        for(Integer num : nums){
            hMap.put(num, hMap.getOrDefault(num,0)+1);
        }
        
        
        TreeMap<Integer,ArrayList<Integer>> tMap = new TreeMap<>();
        for(Map.Entry<Integer,Integer> entry : hMap.entrySet()){
            
                if(tMap.containsKey(entry.getValue())){
                    ArrayList<Integer> al = tMap.get(entry.getValue());
                    al.add(entry.getKey());
                    tMap.put(entry.getValue(),al);
                }else{
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(entry.getKey());
                    tMap.put(entry.getValue(), al);    
                }
        }
        
        int count=0;
        int ans[] = new int[k];
        
        for(Integer key : tMap.descendingKeySet()){
            
          //  System.out.println(key);
                if(count == k){
                    return ans;
                }
                ArrayList<Integer> al = tMap.get(key);
                Collections.sort(al,Collections.reverseOrder());
                for(Integer num : al){
                    if(count == k){
                     return ans;
                    }
                    ans[count] = num;
                    count++;
                }    
        }
        
        return ans;
    }
}
