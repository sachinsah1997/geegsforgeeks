import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args){
	    
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	
	    while(t>0){
	        int arrLength = sc.nextInt();
	 	    int d = sc.nextInt();
	    
	        int arr[] = new int[arrLength];
	        int i=0;
	        while(i<arrLength){
	            arr[i] = sc.nextInt();
	            i++;
	        }
	        
	        for(i=d; i<arrLength; i++){
	            System.out.print(arr[i] + " ");    
	        }
	       
	        for(i=0; i<d; i++){
	            System.out.print(arr[i] + " ");    
	        }
	        System.out.println("");
	       
	        t--;
	    }

	 }
}
