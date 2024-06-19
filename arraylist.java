import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int[] arr = {3, 7, 4, 8, 2, 1, 5 };
		int n= arr.length;
	    int key =6;
	  
	    ArrayList<Integer> nimmi = new ArrayList<Integer>();
         for(int i=0; i<n; i++)
         {
              nimmi.add(arr[i]);
         }
	    
	    nimmi.add(key);
	    Collections.sort(nimmi);
		    
		  System.out.println(nimmi);
		
		
		
		
	}
}
