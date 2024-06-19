import java.util.*;
 
public class Main
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new  ArrayList<>();
		arr.add(11);
		arr.add(12);
		arr.add(5);
		arr.add(7);
		arr.add(1);
		int tar = 12;
		
		for(int i=0; i<arr.size(); i++)
		{
		    int t =12-arr.get(i);
		    if(arr.contains(t))
		    { 
		       System.out.print(" "+arr.get(i));
		        
		    }
		}
		
		

		
	}
}
