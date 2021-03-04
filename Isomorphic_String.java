// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends




class Solution{
    // This function returns true if str1 and str2 are ismorphic
    // else returns false
    public static boolean areIsomorphic(String str1,String str2)
    {
        int sLength1 = str1.length();
        int sLength2 = str2.length();
        
        if(sLength1 != sLength2){
            return false;
        }
        
        int arr1[] = new int[256];
        int arr2[] = new int[256];
        
        //HashMap<Character,Character> cTrack = new HashMap<>();
        
        for(int i=0; i<sLength1; i++){
            
            if(arr1[str1.charAt(i)] != arr2[str2.charAt(i)]){
                return false;
            }else{
                arr1[str1.charAt(i)]++;
                arr2[str2.charAt(i)]++;
            }
        }
        return true;
    }
}
