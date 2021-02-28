// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new solve().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class solve{
    static int minJumps(int[] arr){
        
        int arrLength = arr.length;
        
        int step = arr[0];
        int reach = arr[0];
        int jump = 1; 
        
        if(arrLength <= 1){
            return 0;
        }else if(arr[0] == 0){
            return -1;
        }else{
            
            for(int i=1; i<arrLength; i++){
                
                if(i == arrLength-1 || step >= arrLength-1){
                    return jump;
                }
                
                reach = Math.max(reach, i+arr[i]);
                step--;
                
                if(step == 0){
                    jump++;
                    if(i>= reach){
                        return -1;
                    }
                    step = reach-i;
                }
            }
        }
        return jump;
    }
}
