// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            RomanToNumber rn = new RomanToNumber();
            System.out.println(rn.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class RomanToNumber {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        
        int strLength = str.length();
        int ans =0;
        for(int i=0; i<strLength-1; i++){
            
            int temp = value(str.charAt(i));
            if(temp < value(str.charAt(i+1))){
                temp *= -1;
            }
            ans += temp;
        }
        
        return ans+value(str.charAt(strLength-1));
    }
    
    static int value(char ch){
        
        int res = 1;
        
        switch(ch){
            case 'M' : res=1000;break;
            case 'D' : res=500; break;
            case 'C' : res=100;break;
            case 'L' : res=50;break;
            case 'X' : res=10;break;
            case 'V' : res=5;
        }
        
        return res;
        }
}
