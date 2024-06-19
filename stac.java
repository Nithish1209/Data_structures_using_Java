import java.util.*;

public class stac
{
	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<Integer>();
		 st.push(3);
		 	 st.push(9);
		 	 	 st.push(34);
		 	 	 st.push(8);
		 	 	 st.push(123);
		 	 	 System.out.println(st);
		 	 	 st.pop();
		 	 System.out.println( st);
			 System.out.println("peek ele  : "+st.peek());
              System.out.println( "size of  stack  :"+st.size());
     
         if(st.isEmpty())
         {
             System.out.println(" the Stack is Empty");
         }
         else {
              System.out.print("stack is not Empty");
         }

		 
	}
}
