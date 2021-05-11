// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends





class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> ansList = new ArrayList<>();
        int start=0;
        int sum = 0;
        for(int end=0; end<n; end++){
            sum+=arr[end];
            if(sum == s){
                ansList.add(start+1);
                ansList.add(end+1);
                return ansList;
            }
            while(sum > s){
                sum -= arr[start];
                start++;
                if(sum == s){
                    ansList.add(start+1);
                    ansList.add(end+1);
                    return ansList;
                }
            }
        }
        
        ansList.add(-1);
        
        return ansList;
    }
}
