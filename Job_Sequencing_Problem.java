// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution{
    // return an array of size 2 having the 0th element equal to the count
    // and 1st element equal to the maximum profit
    int[] JobScheduling(Job arr[], int n){
        
        Arrays.sort(arr, new Comparator<Job>(){
            
            public int compare(Job a, Job b){
                return (b.profit) - (a.profit);
            }
        });
        
        int max = 0;
        for(Job job : arr){
        
                if(job.deadline > max){
                    max = job.deadline;
                }
        }
        int ans[] = {0,0};
        int trackArr[] = new int[max+1];
        
        for(Job job : arr){
            for(int i=job.deadline; i>0; i--){
                
                if(trackArr[i] == 0){
                    trackArr[i] = i;
                    ans[1] += job.profit;
                 // System.out.println(job.profit);
                    ans[0]++;
                    break;
                }
            }
        }
        
        // LinkedHashMap<Integer,Integer> hMap = new LinkedHashMap<>();
    
        // for(Job job : arr){
            
        //     if(hMap.containsKey(job.deadline)){
        //         int prevProfit = hMap.get(job.deadline);
        //         if(job.profit>prevProfit){
        //             hMap.put(job.deadline,job.profit);
        //         }
        //         }else{
        //             hMap.put(job.deadline,job.profit);
        //         }
        // }
        
        // hMap.entrySet().stream().forEach((k)-> {
        //     value[0]++;
        //     value[1] += k.getValue();
        //   // System.out.println(k.getValue());
            
        // });
        
        return ans;
    }
}
