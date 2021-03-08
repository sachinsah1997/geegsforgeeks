// { Driver Code Starts
import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			GfG g = new GfG();
			System.out.println(g.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete this method */
class GfG
{
    int atoi(String str){
	    
	    int i=0;
	    try{
	        i = Integer.parseInt(str);
	    }catch(Exception e){
	        return -1; 
	    }
	    return i;
    }
}
