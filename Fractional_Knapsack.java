// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        TreeMap<Double,ArrayList<Integer>> tMap = new TreeMap<>(Collections.reverseOrder());
        
        for(int i=0; i<n; i++){
            
            double temp = (arr[i].value*1.0)/arr[i].weight*(1.0);
            if(tMap.containsKey(temp)){
                ArrayList<Integer> al = tMap.get(temp);
                al.add(i);
                tMap.put(temp, al);
            }else{
                ArrayList<Integer> al = new ArrayList<>();
                al.add(i);
                tMap.put(temp, al);
            }
        }
        
        double sum=0;
        int cap = 0;
        for(Map.Entry<Double,ArrayList<Integer>> entry : tMap.entrySet()){
            
            ArrayList<Integer> idxList = entry.getValue();
           // System.out.println(arr[idx].weight);
           
            for(int idx : idxList){
            if(arr[idx].weight + cap <W){
                cap += arr[idx].weight;
                sum += arr[idx].value;
            }else if(arr[idx].weight+cap>W){
                double frac = ((arr[idx].value/(arr[idx].weight*1.0))*((W-cap)*1.0));
                sum += frac;
                return sum;
            }else if(arr[idx].weight + cap == W){
                cap += arr[idx].weight;
                sum += arr[idx].value;
                return sum;
            }
            }
        }
        
        return sum;
        
    }
}
