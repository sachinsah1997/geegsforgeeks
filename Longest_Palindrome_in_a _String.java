import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	 	
	 	Scanner sc = new Scanner(System.in);
	 	int numOfTest = sc.nextInt();
	 	
	 	while(numOfTest>0){
	 	    
	 	    String s = sc.next();
	 	    longestPalindrome(s);
	 	    numOfTest--;
	 	}
	 }
	 
	 static void longestPalindrome(String str){
	     
	     int sLength = str.length();
	     StringBuilder revStr = new StringBuilder(str);
	     revStr.reverse();
	     int dp[][] = new int[sLength+1][sLength+1];
	     int max = 0, x=0,y=0;
	     
	     for(int i=1; i<=sLength; i++){
	         for(int j=1; j<=sLength; j++){
	   
	                if(str.charAt(i-1) == revStr.charAt(j-1)){
	                    dp[i][j] = 1+dp[i-1][j-1];
	                    
	                    if(max<dp[i][j]){
	                         max = dp[i][j];
	                         x = i;
	                         y = j;
	                    }
	  
	                }else{
	                    dp[i][j] = 0;
	                }
	         }
	     }
	     
	   //  if(dp[x][y] == 1){
	   //      System.out.println(""+str.charAt(x-1));
	   //      return;
	   //  }else 
	   //  }
	    
	    int i=x, j=y;
	     String palinStr = "";   

	        while(dp[x][y] != 0){
	             palinStr += str.charAt(x-1);
	             x--;
	             y--;
	        }
        
        
	      if(palinStr.length() == 2){
	         if(palinStr.charAt(0) == palinStr.charAt(1)){
	             System.out.println(palinStr);
	         }else{
	             System.out.println(str.charAt(0));
	         }
	         return;
	      }
        	     
	     System.out.println(palinStr);
	 }
}
