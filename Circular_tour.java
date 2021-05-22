// { Driver Code Starts
import java.util.*;


class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new Solution().tour(p,d));
		t--;
		}
	}
}// } Driver Code Ends


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	    
	   // int sumPetrol=0;
	   // int dist=0;
	   // for(int num : petrol){
	   //     sumPetrol+= num;
	   // }
	    
	   // for(int num : distance){
	   //     dist+= num;
	   // }
	    
	   // if(sumPetrol<dist){
	   //     return -1;
	   // }
	    
	    int arrSize=petrol.length;
	    
	    int petrolTank=0;
	    int deficit=0;
	    int start = 0;
	    for(int i=0; i<arrSize; i++){
	        
	        petrolTank += petrol[i]-distance[i];
	        if(petrolTank<0){
	            start = i+1;
	            deficit+=petrolTank;
	            petrolTank=0;
	        }
	    }
	    //deficit will have negative numer see abouve if pertolTank <0
	    return (petrolTank+deficit)>=0 ? start:-1;
    }
}
