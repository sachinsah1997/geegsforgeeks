/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> ansList = new ArrayList<>(); 
		ansList = printAllSubSeq(str);
		ansList.remove(0);
	
	    System.out.println(ansList);
	}
	
	public static ArrayList<String> printAllSubSeq(String str){
	    
	    ArrayList<String>  al = new ArrayList<>();
	    
	    if(str.length() == 0){
	        al.add("");
	        return al;
	    }
	   
	    
	    char remChar = str.charAt(0);
	    str = str.substring(1);
	    al = printAllSubSeq(str);
	    
	    ArrayList<String> ansList = new ArrayList<>();
	    for(String s : al){
	        ansList.add(""+ s);
	    }
	    for(String s : al){
	        ansList.add(remChar + s);
	    }
	    
	    return ansList;
	    
	}
}
