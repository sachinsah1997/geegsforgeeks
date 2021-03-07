// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int transitionPoint(int arr[], int n) {
        
        int low=0, high=n-1;
        
        if(low == high){
            if(arr[low] == 1){
                return low;   
            }else{
                return -1;
            }
        }
        
        if(arr[low] == 1){
            return 0;
        }
        
        while(low<high){
            
            int mid = (low+high)/2;
            
            if(arr[mid] == 0 && arr[mid+1] == 1){
                return mid+1;
            }else if(arr[mid] == 0 && arr[mid+1] == 0){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        
        return -1;
    }
}
