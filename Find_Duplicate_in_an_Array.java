// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
    
        ArrayList<Integer> al = new ArrayList();
    // //    HashSet<Integer> al = new HashSet<>();
    //     HashMap<Integer,Integer> hmap = new HashMap<>();
    //     for(int i=0; i<length; i++){
            
    //          int k = hmap.getOrDefault(arr[i], 0);
    //          hmap.put(arr[i],++k);
    //     }
        
    //     hmap.forEach((k,v)->{
    //             if(v>1){
    //                 al.add(k);
    //             }   
    //     });
        
        
        
        int max = 0;
        for(int num : arr){
            if(max<num){
                max = num;
            }
        }
        
        int tmp[] = new int[max+1];
        for(int i=0; i<n; i++){
                tmp[arr[i]]++;
        }
        
        int length = tmp.length;
         for(int i=0; i<length; i++){
                if(tmp[i]>1){
                    al.add(i);
                }
        }
        
        if(al.isEmpty()){
            al.add(-1);
        }
        
        return al;
    }
}
