// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        
        if(s.equals("0.0.0.0")){
            return true;
        }
        
        if(s.charAt(s.length()-1) == '.'){
            return false;
        }
        
        String[] classValue = s.split("\\.");
        
        if(classValue.length != 4){
            return false;
        }
        
        for(String str : classValue){
            if(str.isEmpty() || str.length() > 3){
                return false;
            }
            
            boolean zeroAllowed = false;
            for (int j = 0; j < str.length(); j++){
                
                if ((str.charAt(j) >= '0' && str.charAt(j) <= '9') == false)
                    return false;
                    
                if(str.length() == 1)
                    break;
                    
                // if lenght is more than one, check for leading 0
                
                if (str.charAt(j) == '0' && zeroAllowed == false)
                    return false;
                    
                zeroAllowed = true;
            }
            int num = Integer.parseInt(str); 
            if ((num >= 0 && num <= 255) == false)
                return false;
            
        }
        
        return true;
    }
}
