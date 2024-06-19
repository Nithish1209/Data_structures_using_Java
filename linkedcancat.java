import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner rd = new Scanner(System.in);
		 LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();

		 int n=5;
		 System.out.println("List  1 elements : ");
		 for(int i=0; i<n; i++)
		 {
		      l1.add(rd.nextInt());
		 }
		
		 
		  System.out.println("List  2 elements : ");
		 for(int i=0; i<n; i++)
		 {
		      l2.add(rd.nextInt());
		 }
		 
		
		 	  	 for(int i=0; i<n; i++)
		 {
		    l1.add(l2.get(i));
		 }
		 
		  
		  
		  
		  
		  
		 System.out.println(l1);
		 
		 
		 
		 
	}
}
