import java.util.*;


public class Main
{
	public static void main(String[] args)
	{
		Scanner rd = new Scanner(System.in);
		
		 int n= rd.nextInt();
		 LinkedList<Integer> nimmi = new LinkedList<Integer>();
	     for(int i=0; i<n; i++)
	     {
	         nimmi.add(rd.nextInt());
	         
	     }
		
		
		
		for(int i=0; i<n; i++)
		{
		   
	System.out.print(nimmi.get(i)+" ");
		
		}

		
	}
}
