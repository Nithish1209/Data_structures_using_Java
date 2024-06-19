import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		Scanner rd = new Scanner(System.in);
		System.out.println(" Enter the size ");
    	int n =rd.nextInt();
		 LinkedList<Integer> ll = new LinkedList<>();
		  for(int i=0; i<n; i++)
		  {
		      ll.add(rd.nextInt());
		  }
		  
		  
		  ll.addFirst(121);
		  
		  System.out.println(ll);
		
		
		
	}
}
