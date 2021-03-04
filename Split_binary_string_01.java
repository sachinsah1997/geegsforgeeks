/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sLength = str.length();
		
		int count0 = 0, count1 = 0;
		int count = 0;
		for(int i=0; i<sLength; i++){
		    
		    if(str.charAt(i) == '0'){
		        count0++;
		    }else{
		        count1++;
		    }
		    
		    if(count0 == count1){
		        count++;
		    }
		}
		
		if(count <= 0){
		    System.out.println(-1);
		}else{
		    System.out.println(count);
		}
		
	
	}
}
