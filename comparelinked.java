import java.util.*;
public class Main
{
	public static void main(String[] args)
	{ 
	    Scanner rd = new Scanner(System.in);
	    LinkedList<Integer> arr1 = new LinkedList<Integer>();
	    LinkedList<Integer> arr2 = new LinkedList<Integer>();
	   int a1len =rd.nextInt();
	for(int i=0; i<a1len; i++)
 {
      arr1.add(rd.nextInt());
      
 }
     int a2len =rd.nextInt();
	     for(int i=0; i<a2len; i++)
	     {
	           arr1.add(rd.nextInt());
	     }
	     
	     
	    
	     if(a1len == a2len)
	     {
	    
	          for(int i=0; i<a1len; i++)
	          {
	              
	              if(arr1.get(i) != arr1.get(i))
	              {
	                System.out.println(0);
	              }
	              
	               
	          }
	         
	         
	     }
	     
	     
	     System.out.println(1);
	   
	   
	   
	   
	   
	}
}
