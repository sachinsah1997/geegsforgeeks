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
        
        int arr[] = new int[26];
        arr['I'-65] = 1;
        arr['V'-65] = 5;
        arr['X'-65] = 10;
        arr['L'-65] = 50;
        arr['C'-65] = 100;
        arr['D'-65] = 500;
        arr['M'-65] = 1000;
        
        int length = str.length();
        int result = 0; //arr[str.charAt(0)-65];
        
        if(length==1){
            return arr[str.charAt(0)-65];
        }
        
        for(int i=0; i<length-1; i++){
            if(arr[str.charAt(i)-65] >= arr[str.charAt(i+1)-65]){
                result += arr[str.charAt(i)-65];
            }else{
                result -= arr[str.charAt(i)-65];
            }
          // System.out.println(arr[str.charAt(i)-65]);
        }
          result += arr[str.charAt(length-1)-65];
        return result;
    }
}
