import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	     
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     
	     while(t>0){
	         
	         String str = sc.next();
	         char[] ch = str.toCharArray();
	         Arrays.sort(ch);
	         allPermutation(new String(ch), "");
	         System.out.println("");
	         t--;
	     }
	     
	 }
	 a
	 static void allPermutation(String str, String ans){
	     
	        
	        int sLength = str.length();
	        if(sLength == 0){
	            System.out.print(ans+ " ");
	            return;
	        }
	        
	        for(int i=0; i<sLength; i++){
	            char c = str.charAt(i);
	            String newString = str.substring(0,i)+str.substring(i+1);
	            allPermutation(newString, ans+c);
	        }
	     
	 }
}
